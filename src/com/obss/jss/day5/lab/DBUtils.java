package com.obss.jss.day5.lab;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.obss.jss.day5.utils.JDBCUtils;

public class DBUtils {

	private static final String STATEMENT_CREATE_CONTACTS_TABLE = "CREATE TABLE IF NOT EXISTS contacts" + "("
			+ " id int(11) NOT NULL AUTO_INCREMENT," + " first_name varchar(100) NOT NULL,"
			+ " last_name varchar(100) NOT NULL," + " email varchar(45) DEFAULT NULL," + " PRIMARY KEY (id)" + ")";

	public static void createContactsTable() throws SQLException {
		System.out.println("Creating contacts table if not exists...");
		Connection connection = JDBCUtils.connectToDb(false);
		PreparedStatement preparedStatement = null;

		try {
			preparedStatement = connection.prepareStatement(STATEMENT_CREATE_CONTACTS_TABLE);
			preparedStatement.execute();
		} catch (SQLException e) {
			System.err.println("Error creating contacts table: " + e);
			throw e;
		}

		System.out.println("contacts table created.");
	}

	public static List<Contact> searchContact(String name) throws ConnectionException, QueryException {
		Connection connection = JDBCUtils.connectToDb(false);
		PreparedStatement preparedStatement = null;
		if (connection != null) {
			try {
				String query = "select * from contacts where LOWER(first_name) like ? OR LOWER(last_name) like ?";
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setString(1, "%" + name + "%");
				preparedStatement.setString(2, "%" + name + "%");

				ResultSet rs = preparedStatement.executeQuery();
				List<Contact> contacts = parseResultSet(rs);
				return contacts;
			} catch (SQLException e) {
				String errMsg = "Error while querying the db: ";
				System.err.println(errMsg + e);
				throw new QueryException(errMsg);
			} finally {
				try {
					connection.close();
					if (preparedStatement != null) {
						preparedStatement.close();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} else {
			String errMsg = "Connection is null, could not connect to db...";
			System.err.println(errMsg);
			throw new ConnectionException(errMsg);
		}
	}

	public static List<Contact> parseResultSet(ResultSet resultSet) throws SQLException {
		List<Contact> contacts = new ArrayList<>();

		try {
			while (resultSet.next()) {
				// get column value using column name
				long id = resultSet.getInt("id");
				// can also get column value using column index
				String firstName = resultSet.getString(2);
				String lastName = resultSet.getString("last_name");
				String email = resultSet.getString("email");
				contacts.add(new Contact(id, firstName, lastName, email));
			}
			return contacts;
		} catch (SQLException e) {
			throw e;
		} finally {
			resultSet.close();
		}
	}

	public static int saveContact(Contact contact) throws QueryException, ConnectionException {
		Connection connection = JDBCUtils.connectToDb(true);
		PreparedStatement statement = null;
		if (connection != null) {
			try {
				String query = "insert into contacts(first_name, last_name, email) values(?, ?, ?)";
				statement = connection.prepareStatement(query);
				statement.setString(1, contact.getFirstName());
				statement.setString(2, contact.getLastName());
				statement.setString(3, contact.getEmail());
				int result = statement.executeUpdate();
				return result;
			} catch (SQLException e) {
				String errMsg = "Error while inserting to the db: ";
				System.err.println(errMsg + e);
				throw new QueryException(errMsg);
			} finally {
				try {
					connection.close();
					if (statement != null) {
						statement.close();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} else {
			String errMsg = "Connection is null, could not connect to db...";
			System.err.println(errMsg);
			throw new ConnectionException(errMsg);
		}
	}

	public static int deleteContact(Long idToDelete) throws QueryException, ConnectionException {
		Connection connection = JDBCUtils.connectToDb(true);
		PreparedStatement statement = null;
		if (connection != null) {
			try {
				String query = "delete from contacts where id = ?";
				statement = connection.prepareStatement(query);
				statement.setLong(1, idToDelete);
				int result = statement.executeUpdate();
				return result;
			} catch (SQLException e) {
				String errMsg = "Error while deleting from the db: ";
				System.err.println(errMsg + e);
				throw new QueryException(errMsg);
			} finally {
				try {
					connection.close();
					if (statement != null) {
						statement.close();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} else {
			String errMsg = "Connection is null, could not connect to db...";
			System.err.println(errMsg);
			throw new ConnectionException(errMsg);
		}
	}

	public static int updateContact(Contact updatedContact) throws QueryException, ConnectionException {
		Connection connection = JDBCUtils.connectToDb(true);
		PreparedStatement statement = null;
		if (connection != null) {
			try {
				String query = "update contacts set first_name=?, last_name=?, email=? where id = ?";
				statement = connection.prepareStatement(query);
				statement.setString(1, updatedContact.getFirstName());
				statement.setString(2, updatedContact.getLastName());
				statement.setString(3, updatedContact.getEmail());
				statement.setLong(4, updatedContact.getId());
				int result = statement.executeUpdate();
				return result;
			} catch (SQLException e) {
				String errMsg = "Error while updating the db: ";
				System.err.println(errMsg + e);
				throw new QueryException(errMsg);
			} finally {
				try {
					connection.close();
					if (statement != null) {
						statement.close();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} else {
			String errMsg = "Connection is null, could not connect to db...";
			System.err.println(errMsg);
			throw new ConnectionException(errMsg);
		}
	}
}
