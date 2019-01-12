package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

public class ConnectionTesting {

	
	public static Connection db;
	@Test
	public void TestConnection() {
		
			
			try {
				Class.forName("org.postgresql.Driver");
			} catch (java.lang.ClassNotFoundException e) {
				System.out.println(e.getMessage());
			}

			String url = "jdbc:postgresql://baasu.db.elephantsql.com:5432/mpbhdrzi";
			String username = "mpbhdrzi";
			String password = "VQwpci3Z7sKEzlvuXKkxKVGhNCkSU-5y";

			try {
				if(db == null) {
				db = DriverManager.getConnection(url, username, password);
				System.out.println("system in");
				db.close();
				}

			} catch (java.sql.SQLException e) {
				System.out.println(e.getMessage());
			}
		}

	

	
}
