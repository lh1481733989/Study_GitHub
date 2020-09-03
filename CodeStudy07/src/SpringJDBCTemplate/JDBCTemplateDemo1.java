package SpringJDBCTemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import util.JDBCDruidUtils;

public class JDBCTemplateDemo1 {
    public static void main(String[] args) {
        //1.导入jar包

        //2.创建jdbctemplate对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCDruidUtils.getDataSource());
        //3.调用方法
        String sql = "select * from emp where enten = ?";
        int update = jdbcTemplate.update(sql, 3);
        System.out.println(update);
    }
}
