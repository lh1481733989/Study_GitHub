package jdbc;

import util.JDBCUtils;

import java.sql.*;
import java.util.Scanner;


/**
 * 登录的  正确true 错误false
 */
public class JDBCLoginTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入账户");
        String usrename = scanner.next();
        System.out.println("请输入密码");
        String password = scanner.next();

        boolean login = new JDBCLoginTest().login(usrename,password);

        if(login==true){
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }
    }

    /**
     * 有sql注入的风险
     * @param username
     * @param password
     * @return
     */
    public boolean login(String username , String password){
        if(username==null || password==null){
            return false;
        }
        Connection connection =null;
        Statement statement=null;
        ResultSet resultSet=null;
        try {
            connection = JDBCUtils.getConnection();
            statement = connection.createStatement();
            String sql = "select * from user where username='"+username+"' and password='"+password+"'";
            resultSet = statement.executeQuery(sql);
            return  resultSet.next(); //如果有下一行表示查到了  表示成功
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(statement,resultSet,connection);
        }
        return false;
    }

    /**
     * 解决sql注入的问题
     * @param username
     * @param password
     * @return
     */
    public boolean login2(String username , String password){
        if(username==null || password==null){
            return false;
        }
        Connection connection =null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        try {
            connection = JDBCUtils.getConnection();
            String sql = "select * from user where username = ? and password = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);

            //查询
            resultSet = preparedStatement.executeQuery();
            return  resultSet.next(); //如果有下一行表示查到了  表示成功
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(preparedStatement,resultSet,connection);
        }
        return false;
    }
}
