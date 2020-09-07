package Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.seimicrawler.xpath.JXDocument;

import java.io.File;
import java.io.IOException;

/**
 * jsoup入门
 */
public class JsoupTest2 {
    public static void main(String[] args) throws IOException {
        //1.导入jar包
        //2.根据xml获取document对象
        String path = JsoupTest2.class.getClassLoader().getResource("Students.xml").getPath();
        //3.解析xml文档，将其加载进内存生产dom树
        Document document = Jsoup.parse(new File(path), "utf-8");

        JXDocument jxDocument = new JXDocument(document);


    }
}
