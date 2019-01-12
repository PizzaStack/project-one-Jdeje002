package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

public class TestReturnSelect {

	@Test
	public void returnDbEmployeeInfo() {
		ConnectToDB ctdb = new ConnectToDB();
		
		ctdb.connectToDatabase();
		try {
			PreparedStatement ps = ConnectToDB.db.prepareStatement("select * From employee");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
				System.out.println(rs.getString(5));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ctdb.closeDatabase();
	}
}
