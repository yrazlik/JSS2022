package com.obss.jss.day5.transactionmanagement;

import com.obss.jss.day5.utils.JDBCUtils;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TransactionManagement {

    public static void main(String[] args) {
        Connection connection = JDBCUtils.connectToDb();
        if(connection != null) {
            try {
                connection.setAutoCommit(false);
                Account account = getAccountByAccountNumber("111111",
                        connection);
                if(account != null) {
                    BigDecimal balance = account.getBalance();
                    balance = balance.subtract(new BigDecimal(100));
                    updateAccountBalance(balance,
                            account.getAccountNo(),
                            connection
                    );
                }

                if(isSomethingWrong()) {
                    throw new Exception();
                }

                Account account2 = getAccountByAccountNumber("222222",
                        connection);
                if(account2 != null) {
                    BigDecimal balance = account2.getBalance();
                    balance = balance.add(new BigDecimal(100));
                    updateAccountBalance(balance,
                            account2.getAccountNo(),
                            connection
                    );
                }
                connection.commit();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("An exception occurred. Rolling back transaction...");
                try {
                    connection.rollback();
                } catch (SQLException ex) {
                    System.err.println("Could not rollback transaction!!!");
                }
            }finally {
                try {
                    connection.close();
                    System.out.println("Connection is closed");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static Account getAccountByAccountNumber(String accountNumber, Connection connection) throws SQLException {
        String query = "select * from accounts where account_no = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, accountNumber);
        ResultSet rs = preparedStatement.executeQuery();
        Account account = parseResultSet(rs);
        preparedStatement.close();
        rs.close();
        return account;
    }

    public static int updateAccountBalance(BigDecimal balance, String accountNumber, Connection connection) throws SQLException {
        String query = "update accounts set balance = ? where account_no = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setBigDecimal(1, balance);
        preparedStatement.setString(2, accountNumber);
        int numOfRowsAffected = preparedStatement.executeUpdate();
        preparedStatement.close();
        return numOfRowsAffected;
    }

    public static Account parseResultSet(ResultSet resultSet) throws SQLException {
        Account account = null;

        try {
            while (resultSet.next())  {
                long id = resultSet.getInt("id");
                String accountNo = resultSet.getString("account_no");
                BigDecimal balance = resultSet.getBigDecimal("balance");
                account = new Account(id, accountNo, balance);
            }
            return account;
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        } finally {
            resultSet.close();
            System.out.println("ResultSet is closed");
        }
    }

    public static boolean isSomethingWrong() {
        return false;
    }
}
