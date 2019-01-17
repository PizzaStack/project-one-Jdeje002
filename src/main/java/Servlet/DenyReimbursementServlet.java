package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.DenyReimbursement;


public class DenyReimbursementServlet extends HttpServlet {
	
  
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		DenyReimbursement denyReimbursement = new DenyReimbursement();
		denyReimbursement.denyReimbursement(id);
		
	}

}
