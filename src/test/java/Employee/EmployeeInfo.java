package Employee;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import Dao.ConnectToDB;

public class EmployeeInfo {
	
	@Test
	public void getemployeeInfo() {
		ConnectToDB ctdb = new ConnectToDB();
		ctdb.connectToDatabase();

		try {
			PreparedStatement ps = ConnectToDB.db.prepareStatement("select name, location, phone_number,email from employee where id = 1");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ctdb.closeDatabase();

	}
}
