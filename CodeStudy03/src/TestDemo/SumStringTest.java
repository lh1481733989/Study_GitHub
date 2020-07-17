package TestDemo;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 计算一个字符串中的每个字出现的个数
 *  1.使用scanner获取用户输入的字符串
 *  2.创建一个map集合，key是字符串中的字符，value是字符的个数
 *  3.遍历字符串，获取每一个字符
 *  4.使用获取到的字符去map集合判断key是否存在
 *      if 存在
 *           通过字符(key),获取value(字符个数 )
 *           value++
 *      else
 *           put(key , 1)
 *   5.遍历map集合
 */
public class SumStringTest {
    public static void main(String[] args) {
        //1.
        Scanner scanner = new Scanner(System.in);
        System.out.println("请出入一个字符串");
        String str = scanner.next();
        //2.
        HashMap<Character,Integer> hashMap = new HashMap<>();
        //3.
        for (char c : str.toCharArray()) {
            //4.
            if(hashMap.containsKey(c)){
                Integer integer = hashMap.get(c);
                integer++;
                hashMap.put(c,integer);
            }else{
                hashMap.put(c,1);
            }
        }
        //5
        for (Character character : hashMap.keySet()) {
            Integer value = hashMap.get(character);
            System.out.println("key:"+character+" value:"+value);
        }
    }
}
