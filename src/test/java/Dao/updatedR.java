package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
			System.out.println("Rows affected: " + ps.executeUpdate());

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ctdb.closeDatabase();

	}
	@Test
	public void GetSelect() {
		ConnectToDB ctdb = new ConnectToDB();
		ctdb.connectToDatabase();
		try {
			PreparedStatement ps = ConnectToDB.db.prepareStatement("select * from reimbursement_request ");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
				System.out.println(rs.getInt(1));
				System.out.println(rs.getInt(2));
				System.out.println(rs.getInt(3));
				System.out.println(rs.getString(4));
				System.out.println(rs.getString(5));
				System.out.println(rs.getString(6));
				System.out.println(rs.getDouble(7));
				System.out.println(rs.getBytes(8));
			
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ctdb.closeDatabase();
	}
}
