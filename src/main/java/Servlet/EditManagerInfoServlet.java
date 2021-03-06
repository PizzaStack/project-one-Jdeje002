package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Management.UpdateManagementInfo;


public class EditManagerInfoServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String location = request.getParameter("location");
		String Email = request.getParameter("Email");
		String phoneNumber= request.getParameter("phoneNumber");
		UpdateManagementInfo updateManagementInfo = new UpdateManagementInfo();
		updateManagementInfo.updatedManagementInfo(location,Email,phoneNumber);
		RequestDispatcher dispatcher = request
			      .getRequestDispatcher("/management.html");
			    dispatcher.forward(request, response);
	}

}
