package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Reimbursement.UploadReimbursementRequest;

public class GetReimbursementInfo {
	UploadReimbursementRequest uploadReimbursementRequest= new UploadReimbursementRequest();
	List<UploadReimbursementRequest> uploadReimbursementRequestObjects = new ArrayList<>();
	
	
	public List<UploadReimbursementRequest> getReimbursementInfo() {
		
		ConnectToDB ctdb = new ConnectToDB();
		ctdb.connectToDatabase();
		
		try {
			PreparedStatement ps = ConnectToDB.db.prepareStatement("select * from reimbursement_request ");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
				uploadReimbursementRequest= new UploadReimbursementRequest();
				
				uploadReimbursementRequest.setId(rs.getInt(1));
				uploadReimbursementRequest.setEmployee_id(rs.getInt(2));
				uploadReimbursementRequest.setManangement_id(rs.getInt(3));
				uploadReimbursementRequest.setManangement_Approval(rs.getString(4));
				uploadReimbursementRequest.setTitle(rs.getString(5));
				uploadReimbursementRequest.setDescription(rs.getString(6));
				uploadReimbursementRequest.setAmount(rs.getDouble(7));
				
				
				uploadReimbursementRequestObjects.add(uploadReimbursementRequest);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ctdb.closeDatabase();
		return uploadReimbursementRequestObjects;
	}
	
}
