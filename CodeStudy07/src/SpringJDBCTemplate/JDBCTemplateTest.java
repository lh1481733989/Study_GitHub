package SpringJDBCTemplate;

import JavaBean.Person;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;
import util.JDBCDruidUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class JDBCTemplateTest {
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCDruidUtils.getDataSource());
    //1.修改
    @Test
    public void test(){

        String sql = "update emp set add = 1 where id = 1";
        int update = jdbcTemplate.update(sql);
        System.out.println(update);
    }
    //2.查询并放到map中
    @Test
    public void test1(){
        String sql = "select * from  emp  where id = ?";
        Map<String, Object> stringObjectMap = jdbcTemplate.queryForMap(sql, 2);
        System.out.println(stringObjectMap);
    }

    //2.查询并封装到list中  将查到每条数据放入map集合中 每行数据翻入list集合中
    @Test
    public void test2(){
        String sql = "select * from  emp  where id = ?";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql, 2);
        for (Map<String, Object> map : maps) {
            System.out.println(map);
        }
    }

    //3.查询并封装到person对象中
    @Test
    public void test3(){
        String sql = "select * from  Pserson";
        List<Person> listquery = jdbcTemplate.query(sql, new RowMapper<Person>() {

            @Override
            public Person mapRow(ResultSet resultSet, int i) throws SQLException {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");

                Person person = new Person();
                person.setId(id);
                person.setName(name);
                person.setAge(age);

                return null;
            }
        });
        for (Person person : listquery) {
            System.out.println(person);
        }
    }
    //4.查询并封装到person对象中
    @Test
    public void test3_2(){
        String sql = "select * from  Pserson";
        List<Person> listquery = jdbcTemplate.query(sql,new BeanPropertyRowMapper<Person>(Person.class));
        for (Person person : listquery) {
            System.out.println(person);
        }
    }
    //5.查询所有记录条数
    @Test
    public void test5(){
        String sql = "select * from  Pserson";
        Long aLong = jdbcTemplate.queryForObject(sql, Long.class);
        System.out.println(aLong);
    }
}
