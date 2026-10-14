package com.servlets;

import java.io.IOException;
import java.util.List;

import com.model.NewComplaint;

import dao.ComplaintsDao;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/UpdateDelete")
public class UpdateDelete extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession httpSession = request.getSession();
		String email = (String) httpSession.getAttribute("email");
		ComplaintsDao compDao = new ComplaintsDao();
		List<NewComplaint> complaintsList = compDao.userAllComplaints(email);

		request.setAttribute("complaintsList", complaintsList);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("UpdateDelete.jsp");
		requestDispatcher.forward(request, response);
	}
}
