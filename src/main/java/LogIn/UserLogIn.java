package LogIn;



public class UserLogIn {
	
	
	public String userName;
	public String password;
	protected String compareEmployeeUserName;
	protected String compareEmployeePassword;
	protected String compareManagementUserName;
	protected String compareManagementPassword;
	protected int employee_id;
	protected int management_id;
	
	public void LogIn (String userName,String password) {
		this.userName = userName;
		this.password = password;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCompareEmployeeUserName() {
		return compareEmployeeUserName;
	}
	public void setCompareEmployeeUserName(String compareEmployeeUserName) {
		this.compareEmployeeUserName = compareEmployeeUserName;
	}
	public String getCompareEmployeePassword() {
		return compareEmployeePassword;
	}
	public void setCompareEmployeePassword(String compareEmployeePassword) {
		this.compareEmployeePassword = compareEmployeePassword;
	}
	public String getCompareManagementUserName() {
		return compareManagementUserName;
	}
	public void setCompareManagementUserName(String compareManagementUserName) {
		this.compareManagementUserName = compareManagementUserName;
	}
	public String getCompareManagementPassword() {
		return compareManagementPassword;
	}
	public void setCompareManagementPassword(String compareManagementPassword) {
		this.compareManagementPassword = compareManagementPassword;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public int getManagement_id() {
		return management_id;
	}
	public void setManagement_id(int management_id) {
		this.management_id = management_id;
	}
	
	
	
	
}
