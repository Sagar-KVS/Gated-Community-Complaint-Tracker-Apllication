package com.servlets;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/AdminInfo")
public class AdminInfo extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession httpSession = request.getSession();
		String email = (String) httpSession.getAttribute("email");

		String[] adminNamme = email.split("@");
		String adminName = adminNamme[0];
		httpSession.setAttribute("adminName", adminName);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("AdminLogin.jsp");
		requestDispatcher.forward(request, response);
	}
}
