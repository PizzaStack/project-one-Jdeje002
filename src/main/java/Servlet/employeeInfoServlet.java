package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;

import Employee.ViewEmployeeInfo;

public class employeeInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ViewEmployeeInfo viewEmployeeInfo = new ViewEmployeeInfo();
		viewEmployeeInfo.getEmployeeInfo();
		
		String name = viewEmployeeInfo.getName();
		String location = viewEmployeeInfo.getLocation();
		String phoneNumber = viewEmployeeInfo.getPhoneNumber();
		String Email = viewEmployeeInfo.getEmail();
		
		JSONObject jo = new JSONObject();
		jo.put("name",name);
		jo.put("location",location);
		jo.put("phoneNumber",phoneNumber);
		jo.put("Email",Email);
		PrintWriter output= response.getWriter();
		output.print(jo);
	

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
