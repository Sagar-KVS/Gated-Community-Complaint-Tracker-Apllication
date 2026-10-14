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

@WebServlet("/NewComplaintServlet")
public class NewComplaintServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession httpSession = request.getSession();
		String email = (String) httpSession.getAttribute("email");
		response.setContentType("text/html");

		String complaintName = request.getParameter("complalintName");
		String flatNumber = request.getParameter("FlatNumber");
		String date = request.getParameter("complalintDate");
		String phoneNumber = request.getParameter("phoneNumber");

		NewComplaint complaint = new NewComplaint(complaintName, flatNumber, date, phoneNumber);

		ComplaintsDao newComplaint = new ComplaintsDao();
		newComplaint.saveComplaint(complaint, email);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("acknowledge.jsp");
		requestDispatcher.forward(request, response);
	}

}
