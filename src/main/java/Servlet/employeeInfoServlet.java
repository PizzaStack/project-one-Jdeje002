package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import Employee.ViewEmployeeInfo;

public class employeeInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ViewEmployeeInfo viewEmployeeInfo = new ViewEmployeeInfo();
		viewEmployeeInfo.getEmployeeInfo();
		System.out.println(viewEmployeeInfo.toString());
		
		ObjectMapper on = new ObjectMapper();
	
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		out.println(on.writeValueAsString(viewEmployeeInfo.toString()));

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
