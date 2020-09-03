package jdbc;

import java.sql.*;

/**
 * 查询
 */
public class JDBCConnectionTest03 {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String sql = "select * from accont";
            connection = DriverManager.getConnection("jdbc:mysql:///db3", "root", "root");
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            //遍历结果集
            resultSet.next();
            int ID = resultSet.getInt(1);
            String name = resultSet.getString("name");
            System.out.println("----"+ID+"----"+name);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(resultSet!=null){
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
