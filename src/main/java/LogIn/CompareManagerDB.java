package LogIn;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Dao.ConnectToDB;

public class CompareManagerDB extends UserLogIn{
	
	ConnectToDB ctdb = new ConnectToDB();
	
	public String CompareUsername(String userName) {
		System.out.println(userName);
		ctdb.connectToDatabase();
		
		compareManagementPassword = null;
		try {
			PreparedStatement ps = ConnectToDB.db.prepareStatement("Select password FROM management_user where username='" + userName + "';");
			ResultSet rs = ps.executeQuery();
			
			
			while (rs.next()) {
				
				compareManagementPassword = rs.getString(1);
				System.out.println(compareManagementPassword);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ctdb.closeDatabase();
		
		return compareManagementPassword;
	}
}