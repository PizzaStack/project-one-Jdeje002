package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import LogIn.EmployeeLogIn;


public class LogInServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");	
		
		EmployeeLogIn employeeLogIn = new EmployeeLogIn();
		String loginType = employeeLogIn.employeeLogIn(userName,password);
		
		if(loginType.equals("employee")) {
			response.sendRedirect("employee.html");
		} else if (loginType.equals("manager")) {
			response.sendRedirect("management.html");
		}
		
	}
}
