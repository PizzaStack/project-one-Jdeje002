package LogIn;

public class EmployeeLogIn{
	
	
	public String employeeLogIn(String userName, String password) {
		CompareEmployeeToDB ec = new CompareEmployeeToDB();
	
		String loginType = "";
		
		
		String compareEmployeePassword = ec.CompareUsername(userName);
		if(compareEmployeePassword == null ) {
			loginType ="manager";
			ManagementLogIn ml = new ManagementLogIn();
			ml.employeeLogIn(userName, password);
		}
		else if (compareEmployeePassword.equals(password) ) {
			loginType = "employee";
			
		} else {
			System.out.println("none");
		}
		
		return loginType;
	}
	
}
