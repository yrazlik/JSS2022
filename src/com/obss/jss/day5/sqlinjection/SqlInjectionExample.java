package com.obss.jss.day5.sqlinjection;

import com.obss.jss.day5.entity.Student;
import com.obss.jss.day5.utils.JDBCUtils;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.sql.*;
import java.util.List;

public class SqlInjectionExample  {

    public static void main(String[] args) {
        JFrame f = new JFrame("Get Account");
        f.getContentPane().setLayout(new FlowLayout());

        final JTextField textfield = new JTextField("",10);
        f.getContentPane().add(textfield);

        JButton b=new JButton("Get Account");
        b.setBounds(100,100,140, 40);
        f.add(b);
        f.pack();

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String accountNumber = textfield.getText();
                executeSqlInjectionVulnerableCode(accountNumber);
                //executeSqlInjectionSafeCode(accountNumber);
            }
        });
        f.setVisible(true);
    }

    // 22 OR 1=1
    public static void executeSqlInjectionVulnerableCode(String accountNo) {
        String sql = "SELECT * FROM accounts WHERE account_no = " + accountNo;
        Connection connection = JDBCUtils.connectToDb();
        Statement statement = null;
        if(connection != null) {
            try {
                statement = connection.createStatement();
                ResultSet rs = statement.executeQuery(sql);
                while (rs.next())  {
                    long id = rs.getInt("id");
                    String accNo = rs.getString("account_no");
                    BigDecimal balance = rs.getBigDecimal("balance");
                    System.out.println("Account received. accountNo: " + accNo + ", balance: " + balance);
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

    // 22 OR 1=1
    public static void executeSqlInjectionSafeCode(String accountNo) {
        Connection connection = JDBCUtils.connectToDb();
        PreparedStatement preparedStatement = null;
        if(connection != null) {
            try {
                String query = "select * from accounts where account_no=?";
                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, accountNo);

                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next())  {
                    long id = rs.getInt("id");
                    String accNo = rs.getString("account_no");
                    BigDecimal balance = rs.getBigDecimal("balance");
                    System.out.println("Account received. accountNo: " + accNo + ", balance: " + balance);
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
}
