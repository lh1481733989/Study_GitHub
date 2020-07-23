package TestDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * 1.定义牌 并装好
 * 2.洗牌
 * 3.发牌
 * 4.排序
 * 5.看牌
 */
public class DoudizhuDouble {
    public static void main(String[] args) {
        /*
         * 1.定义一个Map来装所有牌
         * 2.定义一个List集合来装牌的索引
         * 3.装入大王小王
         * 4.创建两个集合 用来装 花色和牌
         * 5.打乱牌序
         * 6.装入集合中
         */
        HashMap<Integer,String> hashMap = new HashMap<>();

        ArrayList<Integer> indexList = new ArrayList<>();

        int index = 0;
        hashMap.put(index,"大王");
        indexList.add(index);
        index++;
        hashMap.put(index,"小王");
        indexList.add(index);
        index++;

        ArrayList<String> color = new ArrayList<>();
        ArrayList<String> number = new ArrayList<>();
        Collections.addAll(color , "♠","♦","♣","♥");
        Collections.addAll(number,"2","A","K","Q","J","10","9","8","7","6","5","4","3");

        for (String numbers : number) {
            for (String colors : color) {
                hashMap.put(index,colors+numbers);
                indexList.add(index);
                index++;
            }
        }

        /*2.洗牌  Collections.shuffle()*/
        Collections.shuffle(indexList);

        /*
          3.发牌
          a.创建三个玩家
          b.将底牌三张空出
          c.用%3的方法给每个玩家发牌*/

        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> lastPoker = new ArrayList<>();

        for (int i=0 ; i < indexList.size() ;i++ ){
            Integer indexListI = indexList.get(i);
            if(i>=51){
                lastPoker.add(indexListI);
            }else if(i%3==0){
                player01.add(indexListI);
            }else if(i%3==1){
                player02.add(indexListI);
            }else if(i%3==2){
                player03.add(indexListI);
            }
        }

        /*排序*/
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(lastPoker);

        /*看牌  查表法*/
        lookPoker("张三",hashMap,player01);
        lookPoker("李四",hashMap,player02);
        lookPoker("王五",hashMap,player03);
        lookPoker("底牌",hashMap,lastPoker);

//        System.out.println("hashMap"+hashMap);
//        System.out.println("indexList:"+indexList);
//        System.out.println("color:"+color);
//        System.out.println("number:"+number);
//        System.out.println("player01:"+player01);
//        System.out.println("player02:"+player02);
//        System.out.println("player03:"+player03);
//        System.out.println("lastPoker:"+lastPoker);
    }

    /**
     * 看牌  查表法
     * HashMap<Integer,String> hashMap
     * ArrayList<Integer> indexList
     * String name
     */
    private static void lookPoker(String name,HashMap<Integer,String> hashMap,ArrayList<Integer> indexList) {
        System.out.print(name +": ");
        for (Integer i : indexList) {
                String value = hashMap.get(i);
            System.out.print(value+"");
        }
        System.out.println("");
    }
    /*public  static <E> void plor(ArrayList<Integer> indexList,ArrayList<E> player01,
                            ArrayList<E> player02,ArrayList<E> player03,ArrayList<E> lastPoker){
        for (int i=0 ; i < indexList.size() ;i++ ){
            Integer integer = indexList.get(i);
            if(i>=51){
                lastPoker.add(indexList);
            }
        }
    }*/
}
