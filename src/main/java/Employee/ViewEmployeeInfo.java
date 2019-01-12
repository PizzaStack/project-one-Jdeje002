package Employee;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Dao.ConnectToDB;

public class ViewEmployeeInfo {
	private String name;
	private String location;
	private String phoneNumber;
	private String Email;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	
	
	public ViewEmployeeInfo() {
		super();
	}

	@Override
	public String toString() {
		return "ViewEmployeeInfo [name=" + name + ", location=" + location + ", phoneNumber=" + phoneNumber + ", Email="
				+ Email + "]";
	}
	
	public void getEmployeeInfo() {
		ConnectToDB ctdb = new ConnectToDB();
		ctdb.connectToDatabase();
		try {
			PreparedStatement ps = ConnectToDB.db.prepareStatement("select name,location,phone_number,email From employee where id = 1");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				this.name = rs.getString(1);
				this.location = rs.getString(2);
				this.phoneNumber = rs.getString(3);
				this.Email = rs.getString(4);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ctdb.closeDatabase();
		
	}
}
