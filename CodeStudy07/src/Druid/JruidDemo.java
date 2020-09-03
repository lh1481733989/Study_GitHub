package Druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class JruidDemo {
    public static void main(String[] args) throws Exception {
        //1.导包
        //2.定义配置文件
        //3.加载配置文件
        Properties properties = new Properties();
        InputStream is = JruidDemo.class.getClassLoader().getResourceAsStream("druid.properties");
        properties.load(is);
        //4.获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        //5.获取连接
        Connection connection = dataSource.getConnection();
        //6.打印
        System.out.println(connection);
    }
}
