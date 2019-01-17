package Employee;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Dao.ConnectToDB;

public class UpdatedEmployeeInfo {

	
	
	public void updatedEmployeeInfo(String location,String Email,String phone_number) {
		ConnectToDB ctdb = new ConnectToDB();
		ctdb.connectToDatabase();
		try {
			PreparedStatement ps = ConnectToDB.db.prepareStatement("Update employee set location='" + location
					+ "', phone_number='"+phone_number+"',email='"+Email+"' where id = 1;");
			 ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ctdb.closeDatabase();
		
	}
}
