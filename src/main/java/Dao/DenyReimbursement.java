package Dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DenyReimbursement {
	public void denyReimbursement(int id) {
		ConnectToDB ctdb = new ConnectToDB();
		ctdb.connectToDatabase();
		try {
			PreparedStatement ps = ConnectToDB.db
					.prepareStatement("Update reimbursement_request set manangement_Approval= ? where id = "+id+"");
			
			
			ps.setString(1, "Denied");
			
			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ctdb.closeDatabase();
	}
}
