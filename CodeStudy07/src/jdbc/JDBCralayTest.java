package jdbc;

import util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 转账案例
 * 出现问题：
 *      没有事务所 在之中出现了异常导致A扣款B没有收到款
 * 解决方法：
 *      加事务
 */
public class JDBCralayTest {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement1 = null;
        PreparedStatement preparedStatement2 = null;
        try {
            connection = JDBCUtils.getConnection();

            //开启事务
            connection.getAutoCommit();

            String sql1 = "update account set balance = balance - ? where id = ?";
            String sql2 = "update account set balance = balance + ? where id = ?";

            preparedStatement1 = connection.prepareStatement(sql1);
            preparedStatement2 = connection.prepareStatement(sql2);

            preparedStatement1.setString(1,"500");
            preparedStatement1.setString(2,"1");

            preparedStatement2.setString(1,"500");
            preparedStatement2.setString(2,"2");

            preparedStatement1.executeUpdate();
            preparedStatement2.executeUpdate();

            //提交事务
            connection.commit();
        } catch (Exception e) {
            //中间出现任何错误都讲回滚事务
            try {
                connection.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }finally {
            JDBCUtils.close(preparedStatement1,connection);
            JDBCUtils.close(preparedStatement1,null);
        }
    }
}
