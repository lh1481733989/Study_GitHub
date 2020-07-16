package TestDemo;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 斗地主综合案例：
 *      1.准备牌
 *      2.洗牌
 *      3.发牌
 *      4.看牌
 */
public class doudizhu {
    public static void main(String[] args) {
        /*准备牌*/
        /*定义一个存储54张牌的ArrayList集合，泛型名使用字符串*/
        ArrayList<String> poker = new ArrayList<>();
        /*定义两个数组  1.花色 2.序号*/
        String[] colors = {"♠","♥","♣","♦"};
        String[] number = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        /*先把大小王存进poker中*/
        poker.add("大王");
        poker.add("小王");
        /*循环嵌套遍历两个数组，组装52张牌*/
        for (String numbers : number){
            for (String color : colors) {
                /*System.out.println(color+numbers);*/
                poker.add(color+numbers);
            }
        }
        /*System.out.println(poker);*/

        /** 洗牌
        *   使用工具类Collections中打乱顺序方法
        *   public static void shuffle(List<?> list, Random rnd)使用指定的随机源对指定列表进行置换。
        * */
        Collections.shuffle(poker);
        /*System.out.println(poker);*/

        /**
         * 发牌
         * 遍历集合获取每一张牌
         * 使用poker集合索引%3来给三个玩家发牌  留三张给底牌
         * 注意：
         *      先判断(i>=51)，否则牌就发完了
         */
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        for (int i = 0; i <poker.size() ; i++) {
            String index = poker.get(i);
            if(i >= 51){
                dipai.add(index);
            }else if (i%3 == 0){
                player1.add(index);
            }
            else if (i%3 == 1){
                player2.add(index);
            }
            else if (i%3 == 2){
                player3.add(index);
            }
        }

        /**
         * 看牌
         */
        System.out.println("刘德华："+player1);
        System.out.println("周润发："+player2);
        System.out.println("周星驰："+player3);
        System.out.println("底牌："+dipai);
    }
}
