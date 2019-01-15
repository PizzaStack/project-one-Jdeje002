package Dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.Test;

public class updatedR {

	@Test
	public void getEmployeeInfo() {
		ConnectToDB ctdb = new ConnectToDB();
		ctdb.connectToDatabase();
		try {
			PreparedStatement ps = ConnectToDB.db
					.prepareStatement("Insert Into reimbursement_request (employee_id,title,description,amount,receipt,manangement_Approval) VALUES (?,?,?,?,?,?)");
			
			ps.setInt(1, 1);
			ps.setString(2, "test");
			ps.setString(3, "test");
			ps.setDouble(4, 3);
			ps.setBytes(5, new byte[]{1,2,3,4});
			ps.setString(6, "Pending");
			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ctdb.closeDatabase();

	}
}
