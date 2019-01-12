package LogIn;

public class ManagementLogIn {
	
	public void employeeLogIn(String userName, String password) {
		CompareManagerDB mdb = new CompareManagerDB();
		
		String compareManagementPassword = mdb.CompareUsername(userName);

		
		
		if(compareManagementPassword == null ) {
			
			
			
		}
		else if (compareManagementPassword.equals(password) ) {
			System.out.println("management");
		} else {
			System.out.println("404");
		}
	}
}
