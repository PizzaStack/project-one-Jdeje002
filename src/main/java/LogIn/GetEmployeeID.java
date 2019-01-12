package LogIn;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Dao.ConnectToDB;

public class GetEmployeeID {
	private int Id;

	public int getEmployeeID(String userName) {
		ConnectToDB ctdb = new ConnectToDB();

		ctdb.connectToDatabase();
		try {
			PreparedStatement ps = ConnectToDB.db
					.prepareStatement("Select employee_id FROM employee_user where username='" + userName + "';");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Id = rs.getInt(1);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ctdb.closeDatabase();
		return Id;
	}
}
