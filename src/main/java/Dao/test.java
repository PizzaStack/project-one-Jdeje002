//package Dao;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//import Employee.Employee;
//
//public class test {
//
//	public void d(Employee employee) {
//		
//		try {
//			PreparedStatement database = ConnectToDB.db.prepareStatement("insert into employee(FirstName, LastName) values(?,?)");
//			database.setString(1, employee.getFirstName());
//			database.setString(2, employee.getLastName());
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
//	
//	public void e() {
//		
//		try {
//			PreparedStatement database = ConnectToDB.db.prepareStatement("SELECT * FROM HELP;");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
//}
