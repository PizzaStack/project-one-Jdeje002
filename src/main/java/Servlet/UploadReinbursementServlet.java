package Servlet;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.google.common.io.ByteStreams;

import Dao.UploadReimbursementToDB;

@MultipartConfig
public class UploadReinbursementServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("Id"));
	    String title = request.getParameter("Title");
	    String description = request.getParameter("Description");
	    Double amount = Double.parseDouble(request.getParameter("Amount"));
		Part partReceipt = request.getPart("Receipt");
		

		InputStream initialStream = partReceipt.getInputStream();
		byte[] receipt = ByteStreams.toByteArray(initialStream);
		
		
		
		UploadReimbursementToDB uploadToDB = new UploadReimbursementToDB();
		uploadToDB.uploadReimbursementToDB(id, title, description, amount, receipt);
		
		
		
		System.out.println(id);
		System.out.println(title);
		System.out.println(amount);
		System.out.println(description);
		System.out.println(receipt);
		
		RequestDispatcher dispatcher = request
			      .getRequestDispatcher("/employee.html");
			    dispatcher.forward(request, response);
		
		
	}

}
