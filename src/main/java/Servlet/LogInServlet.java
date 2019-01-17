package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import LogIn.EmployeeLogIn;
import LogIn.GetEmployeeID;


public class LogInServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");	
		
		EmployeeLogIn employeeLogIn = new EmployeeLogIn();
		String loginType = employeeLogIn.employeeLogIn(userName,password);

		
		if(loginType.equals("employee")) {
			GetEmployeeID employeeUserId = new GetEmployeeID();
			int EmployeeUserId = employeeUserId.getEmployeeID(userName);
			
			RequestDispatcher dispatcher = request
				      .getRequestDispatcher("/employee.html");
				    dispatcher.forward(request, response);
				    
		} else if (loginType.equals("manager")) {
			RequestDispatcher dispatcher = request
				      .getRequestDispatcher("/management.html");
			dispatcher.forward(request, response);
		}
		
	}
}
