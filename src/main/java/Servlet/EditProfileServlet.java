package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import Employee.UpdatedEmployeeInfo;


public class EditProfileServlet extends HttpServlet {
	
	JSONObject jo = new JSONObject();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter output= response.getWriter();
		output.print(jo);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String location = request.getParameter("location");
		String Email = request.getParameter("Email");
		String phoneNumber= request.getParameter("phoneNumber");
		
		
		UpdatedEmployeeInfo updatedEmployeeInfo = new UpdatedEmployeeInfo();
		updatedEmployeeInfo.updatedEmployeeInfo(location, Email, phoneNumber);
		
		
		jo.put("location",location);
		jo.put("phoneNumber",phoneNumber);
		jo.put("Email",Email);
		
		RequestDispatcher dispatcher = request
			      .getRequestDispatcher("/employee.html");
			    dispatcher.forward(request, response);
		
	}

}
