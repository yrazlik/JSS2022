package com.obss.jss.day5.statement;

import com.obss.jss.day5.entity.Student;
import com.obss.jss.day5.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StatementExample {

    // https://stackoverflow.com/questions/4507440/must-jdbc-resultsets-and-statements-be-closed-separately-although-the-connection

    public static void main(String[] args) {
        //selectExample();
        insertExample();
        //updateExample();
        // deleteExample();
    }

    public static void selectExample() {
        Connection connection = JDBCUtils.connectToDb();
        Statement statement = null;
        if(connection != null) {
            try {
                statement = connection.createStatement();
                String query = "select * from student";
                ResultSet rs = statement.executeQuery(query);
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
                    if(statement != null) {
                        statement.close();
                        System.out.println("Statement is closed");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void insertExample() {
        Connection connection = JDBCUtils.connectToDb();
        Statement statement = null;
        if(connection != null) {
            try {
                statement = connection.createStatement();
                String query = "insert into student(first_name, last_name, email) values('TEST', 'TEST', 'test@test.com')";
                int result = statement.executeUpdate(query);
                System.out.println(result + " rows inserted.");
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                    System.out.println("Connection is closed");
                    if(statement != null) {
                        statement.close();
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
            e.printStackTrace();
            throw e;
        } finally {
            resultSet.close();
            System.out.println("ResultSet is closed");
        }
    }

    public static void updateExample() {
        Connection connection = JDBCUtils.connectToDb();
        Statement statement = null;
        if(connection != null) {
            try {
                statement = connection.createStatement();
                String updateQuery = "update student set first_name='Yasin2' where id=1";
                int numOfRowsAffected = statement.executeUpdate(updateQuery);
                if(numOfRowsAffected > 0) {
                    System.out.println(numOfRowsAffected + " rows updated...");
                } else {
                    System.out.println("Did not update any rows...");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                    System.out.println("Connection is closed");
                    if(statement != null) {
                        statement.close();
                        System.out.println("Statement is closed");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void deleteExample() {
        Connection connection = JDBCUtils.connectToDb();
        Statement statement = null;
        if(connection != null) {
            try {
                statement = connection.createStatement();
                String deleteQuery = "delete from student where last_name='Öztürk'";
                int numOfRowsAffected = statement.executeUpdate(deleteQuery);
                if(numOfRowsAffected > 0) {
                    System.out.println(numOfRowsAffected + " rows deleted...");
                } else {
                    System.out.println("Did not delete any rows...");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                    System.out.println("Connection is closed");
                    if(statement != null) {
                        statement.close();
                        System.out.println("Statement is closed");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
