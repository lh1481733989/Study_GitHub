package Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * jsoup入门
 */
public class JsoupTest {
    public static void main(String[] args) throws IOException {
        //1.导入jar包
        //2.根据xml获取document对象
        String path = JsoupTest.class.getClassLoader().getResource("Students.xml").getPath();
        //3.解析xml文档，将其加载进内存生产dom树
        /*URL url = new URL("https://jsoup.org/download");
        Document parse = Jsoup.parse(url, 10000);
        System.out.println(parse);*/
        Document document = Jsoup.parse(new File(path), "utf-8");
        System.out.println(document);
        //4.获取元素所有name对象
        Elements names = document.getElementsByTag("age");
        //5.获取第一个name
        System.out.println(names.size());
        System.out.println("-----------");

        //获取属性为id 的对象
        Elements attribute = document.getElementsByAttribute("id");
        System.out.println(attribute);
        System.out.println("----------");
        //获取属性为id  且值为1的情况
        Elements attribute2 = document.getElementsByAttributeValue("id", "1");
        System.out.println(attribute2);
        System.out.println("-----------");

        //获取id属性值的对象
        Element elementById = document.getElementById("1");
        System.out.println(elementById);
        System.out.println("---------------");

        String text = elementById.text();
        System.out.println(text);
        String html = elementById.html();
        System.out.println(html);
        System.out.println("--------------");

        //获取id=1 age子标签
        Elements select = document.select("student[id=1]");
        System.out.println(select);
        System.out.println("--------------");
        //获取id=1 age子标签
        Elements select1 = document.select("student[id=1] > age");
        System.out.println(select1);
        System.out.println("--------------");


    }
}
