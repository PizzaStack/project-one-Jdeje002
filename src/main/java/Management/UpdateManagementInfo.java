package Management;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import Dao.ConnectToDB;

public class UpdateManagementInfo {
	
	public void updatedManagementInfo(String location,String Email,String phone_number) {
		ConnectToDB ctdb = new ConnectToDB();
		ctdb.connectToDatabase();
		try {
			PreparedStatement ps = ConnectToDB.db.prepareStatement("Update management set location='" + location
					+ "', phone_number='"+phone_number+"',email='"+Email+"' where id = 1;");
			 ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ctdb.closeDatabase();
		
	}
}
