package com.obss.jss.day5.lab;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws SQLException {
		Scanner scanner = new Scanner(System.in);
		
		DBUtils.createContactsTable();
		
		String action = null;
		do {
			System.out.println("\nEnter the action: search, insert, update, delete or exit: ");
			action = getUserInput(scanner);
			
			if(UserAction.isValidAction(action)) {
				UserAction userAcion = UserAction.fromAction(action);
				switch (userAcion) {
				case SEARCH: 
					System.out.println("\nPlease enter the contact name you want to search: ");
					String name = getUserInput(scanner);
					List<Contact> resultList = searchContacts(name);
					printResult(resultList);
					break;
				case INSERT:
					System.out.println("\nPlease enter contact name, surname and email separated by commas: ");
					String input = getUserInput(scanner);
					String[] fields = input.split(",");
					Contact contact = new Contact(null, fields[0].trim(), fields[1].trim(), fields[2].trim());
					saveContact(contact);
					break;
				case DELETE:
					System.out.println("\nPlease enter contact id you want to delete: ");
					Long idToDelete = Long.parseLong(getUserInput(scanner));
					deleteContact(idToDelete);
					break;
				case UPDATE:
					System.out.println("\nPlease enter contact id you want to update: ");
					Long idToUpdate = Long.parseLong(getUserInput(scanner));
					System.out.println("Please enter new contact info: contact name, surname and email separated by commas: ");
					String userInput = getUserInput(scanner);
					String[] inputFields = userInput.split(",");
					Contact updatedContact = new Contact(idToUpdate, inputFields[0].trim(), inputFields[1].trim(), inputFields[2].trim());
					updateContact(updatedContact);
					break;
				case EXIT:
					break;
				default:
					System.out.println("Please enter a valid action..");
					break;
				}
			} else {
				System.out.println("\nPlease enter a valid action (search, insert, update, delete or exit)\n");
			}
		} while(!UserAction.isValidAction(action) || (!action.equals("exit")));
		
	}

	public static String getUserInput(Scanner scanner) {
		return scanner.nextLine().trim().toLowerCase();
	}
	
	public static List<Contact> searchContacts(String name) {
		try {
			return DBUtils.searchContact(name);
		} catch (ConnectionException e) {
			System.err.println("A connection error occured, please try again later");
			return null;
		} catch (QueryException e) {
			System.err.println("A query error occured, please try again later");
			return null;
		}
	}
	
	public static int saveContact(Contact contact) {
		try {
			int result = DBUtils.saveContact(contact);
			System.out.println("Saved " + result + " rows.");
			return result;
		} catch (ConnectionException e) {
			System.err.println("A connection error occured, please try again later");
			return 0;
		} catch (QueryException e) {
			System.err.println("A query error occured, please try again later");
			return 0;
		}
	}
	
	private static int deleteContact(Long idToDelete) {
		try {
			int result = DBUtils.deleteContact(idToDelete);
			System.out.println("Saved " + result + " rows.");
			return result;
		} catch (ConnectionException e) {
			System.err.println("A connection error occured, please try again later");
			return 0;
		} catch (QueryException e) {
			System.err.println("A query error occured, please try again later");
			return 0;
		}
	}

	private static int updateContact(Contact updatedContact) {
		try {
			int result = DBUtils.updateContact(updatedContact);
			System.out.println("Updated " + result + " rows.");
			return result;
		} catch (ConnectionException e) {
			System.err.println("A connection error occured, please try again later");
			return 0;
		} catch (QueryException e) {
			System.err.println("A query error occured, please try again later");
			return 0;
		}
	}

	
	public static void printResult(List<Contact> contacts) {
		if(contacts != null && contacts.size() > 0) {
			System.out.println("\nFound some matching contacts...");
			System.out.println("********");
			for(int i = 0; i < contacts.size(); i++) {
				Contact c = contacts.get(i);
				System.out.println(i + "- " + c);
			}
			System.out.println("********");
		} else {
			System.out.println("\nCould not find any contacts");
		}
		
	}
}
