package Employee;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Dao.ConnectToDB;

public class ViewEmployeeInfo {
	protected String name;
	protected String location;
	protected String phoneNumber;
	protected String eMail;
	
	ConnectToDB ctdb = new ConnectToDB();
	
	public void getEmployeeInfo() {
		
		ctdb.connectToDatabase();
		
		try {
			PreparedStatement ps = ConnectToDB.db.prepareStatement("select  From employee");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				name = rs.getString(2);
				location = rs.getString(3);
				phoneNumber = rs.getString(4);
				eMail = rs.getString(5);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ctdb.closeDatabase();
		
	}
}
