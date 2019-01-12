package LogIn;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Dao.ConnectToDB;

public class CompareEmployeeToDB {
	private String compareEmployeePassword;
	
	

	public String CompareUsername(String userName) {
		ConnectToDB ctdb = new ConnectToDB();
		

		ctdb.connectToDatabase();
		try {
			PreparedStatement ps = ConnectToDB.db
					.prepareStatement("Select password FROM employee_user where username='" + userName + "';");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				compareEmployeePassword = rs.getString(1);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ctdb.closeDatabase();
		
		return compareEmployeePassword;
		
	}

}
