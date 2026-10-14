package com.servlets;

import java.io.IOException;

import dao.ComplaintsDao;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/AdminUpadateStatus")
public class AdminUpadateStatus extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String currentStatus = request.getParameter("changestatus");

		ComplaintsDao updateStatus = new ComplaintsDao();
		updateStatus.AdminUpdateComplaint(id, currentStatus);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("adminChangeAck.jsp");
		requestDispatcher.forward(request, response);

	}

}
