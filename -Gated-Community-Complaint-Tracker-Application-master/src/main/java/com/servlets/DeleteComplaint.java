package com.servlets;

import java.io.IOException;

import dao.ComplaintsDao;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/DeleteComplaint")
public class DeleteComplaint extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		HttpSession httpSession = request.getSession();
		String email = (String) httpSession.getAttribute("email");
		String complaintId =  request.getParameter("id");
		
		ComplaintsDao newComplaint = new ComplaintsDao();
		newComplaint.deleteComplaint(complaintId);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("deleteAck.jsp");
		requestDispatcher.forward(request, response);
		
	}

}
