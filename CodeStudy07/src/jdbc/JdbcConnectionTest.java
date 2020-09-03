package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * jdbc概述
 */
public class JdbcConnectionTest {
    public static void main(String[] args) throws Exception {

        //1.导入jar包
        //2.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //3.获取数据库的连接对象
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "123456");
        //4.定义一个sql语句
        String sql = "update accont set balance = 500 where id = 1";
        //5.获取执行sql对象statement
        Statement statement = connection.createStatement();
        //6.执行sql
        int count = statement.executeUpdate(sql);
        //7.处理结果
        System.out.println(count);
        //8.释放资源
        statement.close();
        connection.close();
    }
}
