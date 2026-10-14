package com.servlets;

import java.io.IOException;

import com.model.NewComplaint;

import dao.ComplaintsDao;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/UserUpdateComplaint")
public class UserUpdateComplaint extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		HttpSession httpSession = request.getSession();
		String email = (String) httpSession.getAttribute("email");
		String complaintId =  request.getParameter("id");
		
		
		String complaintName = request.getParameter("complalintName");
		String flatNumber = request.getParameter("FlatNumber");
		String date = request.getParameter("complalintDate");
		String phoneNumber = request.getParameter("phoneNumber");
		
		NewComplaint complaint = new NewComplaint(complaintName, flatNumber, date, phoneNumber);
		
		ComplaintsDao newComplaint = new ComplaintsDao();
		newComplaint.updateUserComplaint(complaint, complaintId);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("updateAck.jsp");
		requestDispatcher.forward(request, response);
	}

}
