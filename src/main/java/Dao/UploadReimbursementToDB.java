package Dao;

import java.sql.PreparedStatement;

import java.sql.SQLException;

public class UploadReimbursementToDB {

	public void uploadReimbursementToDB(int id,String title, String description, double amount, byte[] receipt) {

		
		ConnectToDB ctdb = new ConnectToDB();
		ctdb.connectToDatabase();
		
		try {
			PreparedStatement ps = ConnectToDB.db
					.prepareStatement("Insert Into reimbursement_request (employee_id,title,description,amount,receipt,manangement_Approval) VALUES (?,?,?,?,?,?)");
			
			ps.setInt(1, id);
			ps.setString(2, title);
			ps.setString(3, description);
			ps.setDouble(4, amount);
			ps.setBytes(5, receipt);
			ps.setString(6, "Pending");
			
			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ctdb.closeDatabase();

	}
}
