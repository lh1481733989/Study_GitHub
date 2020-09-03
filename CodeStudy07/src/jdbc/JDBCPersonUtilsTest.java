package jdbc;

import JavaBean.Person;
import util.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCPersonUtilsTest {
    public static void main(String[] args) {
        getAll();
    }
    public static List<Person> getAll(){
        ArrayList<Person> list = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            JDBCUtils.getConnection();

            statement = connection.createStatement();

            String sql = "select * from person";
            resultSet = statement.executeQuery(sql);

            if(resultSet!=null){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");

                Person person = new Person();
                person.setId(id);
                person.setName(name);
                person.setAge(age);

                list.add(person);
            }

        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(statement,resultSet,connection);
        }
        return list;
    }
}
