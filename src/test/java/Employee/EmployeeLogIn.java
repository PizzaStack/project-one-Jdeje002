package Employee;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import Dao.ConnectToDB;
import LogIn.UserLogIn;

public class EmployeeLogIn {
	String userName;
	String password;
	String compareUserName;
	String comparePassword;

	ConnectToDB ctdb = new ConnectToDB();

	@Test
	public void canInstansiate() {
		UserLogIn ul = new UserLogIn();
	}

	@Test
	public void getUsernameAndPassword() {
		ctdb.connectToDatabase();
		try {
			PreparedStatement ps = ConnectToDB.db.prepareStatement("Select username, password FROM employee_user ");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				compareUserName = rs.getString(1);
				comparePassword = rs.getString(2);
				System.out.println(compareUserName + " " + comparePassword);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		userName = "nna";
		if(comparePassword == null) {
			System.out.println("in db");
		}
		else if (compareUserName.equals(userName)) {
			System.out.println("in db");
		} else {
			System.out.println("none");
		}
		ctdb.closeDatabase();
	}

	@Test

	public void checkDB() {

	}
}
