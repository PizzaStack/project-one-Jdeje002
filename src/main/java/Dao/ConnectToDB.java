package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectToDB {

	public static Connection db;
	
	public void connectToDatabase() {
		
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
			}

		} catch (java.sql.SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void closeDatabase() {
		try {
			
			db.close();
			db = null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
