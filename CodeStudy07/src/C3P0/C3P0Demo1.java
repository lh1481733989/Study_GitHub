package C3P0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class C3P0Demo1 {
    public static void main(String[] args) throws SQLException {
        //1.创建连接池
        DataSource dataSource = new ComboPooledDataSource();
        //2.获取连接
        Connection connection = dataSource.getConnection();
        //3.打印
        System.out.println(connection);
    }
}
