package com.obss.jss.day5.preparedstatement;

import com.obss.jss.day5.entity.Student;
import com.obss.jss.day5.utils.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PreparedStatementExample {

    public static void main(String[] args) {
        selectExample();
    }

    public static void selectExample() {
        Connection connection = JDBCUtils.connectToDb();
        PreparedStatement preparedStatement = null;
        if(connection != null) {
            try {
                String query = "select * from student where id=? and first_name=?";
                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setInt(1, 1);
                preparedStatement.setString(2, "Yasin");

                ResultSet rs = preparedStatement.executeQuery();
                List<Student> students = parseResultSet(rs);
                if(students != null) {
                    for (Student student : students) {
                        System.out.println(student);
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                    System.out.println("Connection is closed");
                    if(preparedStatement != null) {
                        preparedStatement.close();
                        System.out.println("Statement is closed");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static List<Student> parseResultSet(ResultSet resultSet) throws SQLException {
        List<Student> students = new ArrayList<>();

        try {
            while (resultSet.next())  {
                // get column value using column name
                long id = resultSet.getInt("id");
                // can also get column value using column index
                String firstName = resultSet.getString(2);
                String lastName = resultSet.getString("last_name");
                String email = resultSet.getString("email");
                students.add(new Student(id, firstName, lastName, email));
            }
            return students;
        } catch (SQLException e) {
            throw e;
        } finally {
            resultSet.close();
            System.out.println("ResultSet is closed");
        }
    }
}
