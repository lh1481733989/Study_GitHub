package jdbc;

import JavaBean.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCPersonTest {
    public static void main(String[] args) {
        getAll();
    }
    public static List<Person> getAll(){
        ArrayList<Person> list = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String sql = "select * from person";
             connection = DriverManager.getConnection("jdbc:mysql:///db3", "root", "root");
             statement = connection.createStatement();
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

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(connection!=null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(resultSet!=null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }
}
