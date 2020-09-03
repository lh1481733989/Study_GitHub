package Druid;

import util.JDBCDruidUtils;

import java.sql.*;

/**
 * 测试Jruid工具类
 */
public class UseJruidTest {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet =null ;
        try {
             connection = JDBCDruidUtils.getConnection();
            //加事务锁
            /*connection.getAutoCommit();*/
            String sql = "select * from emp where accont = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"张三");
            resultSet = preparedStatement.executeQuery();

            if(resultSet.next()){
                System.out.println("查询成功");
            }else{
                System.out.println("查询失败");
            }

            /*connection.commit();*/
        } catch (Exception e) {
            /*try {
                connection.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }*/
            e.printStackTrace();
        }finally {
            JDBCDruidUtils.close(preparedStatement,resultSet,connection);
        }
    }
}
