package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import Dao.GetReimbursementInfo;
import Reimbursement.UploadReimbursementRequest;


public class DisplayReinbursementServlet extends HttpServlet {
	
       
 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		JSONObject json = new JSONObject();
//		
//		for(UploadReimbursementRequest urr : reimbursementInfo) {
//			json = new JSONObject();
//			json.put("empid", urr.getEmployee_id())
//		}
		
		GetReimbursementInfo getReimbursementInfo = new GetReimbursementInfo();
		
		List<UploadReimbursementRequest> reimbursementInfo = getReimbursementInfo.getReimbursementInfo();
		

		
		
		JSONArray jsonArray = new JSONArray(reimbursementInfo);
		
		
		System.out.println(jsonArray.length());
		
		
		PrintWriter output= response.getWriter();
		output.print(jsonArray);
		
		
	}



}
