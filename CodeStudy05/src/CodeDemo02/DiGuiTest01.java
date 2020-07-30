package CodeDemo02;

import java.io.File;

/**
 * 1~n的和
 */
public class DiGuiTest01 {
    public static void main(String[] args) {
        int sums = sums( 3);
        System.out.println("和为:"+sums);

        /*Recurison*/
        int Recurison = Recurison(10) ;
        System.out.println("Recurison："+Recurison);
        System.out.println("==================================");

        /*openFile*/
        File file = new File("C:\\Users\\admin\\Desktop");
        getAllFile(file);

        /*获取.txt文件*/
    }

    /**
     *
     * @param i1 到N的值
     * @return 1~n的和
     */
    private static int sums( int i1) {
        if(i1==1){
            return 1;
        }
        return i1+sums(i1-1);
    }

    /**
     *
     * @param i 到N的值
     * @return 求阶乘
     */
    private static int Recurison(int i ){
        if(i==1) {
            return 1;
        }
        return i*Recurison(i-1);
    }

    /**
     * 遍历所有文件  问题：二级目录无法展示  解决方案：使用递归 调用自己方法
     * @param dir 文件路径
     */
    private static void getAllFile(File dir){
        File[] files = dir.listFiles();
            for (File f : files) {
            if(f.isDirectory()){
                getAllFile(f);
            }else {
                /*获取.txt文件 返回的是boolean*/
                if(f.getName().toLowerCase().endsWith(".txt")){
                    System.out.println(f);
                }

            }
        }
    }

}