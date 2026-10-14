package com.servlets;

import java.io.IOException;

import com.model.RegisterData;
import com.util.HqlConstants;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");

		HttpSession session = request.getSession();
		session.setAttribute("email", email);
		session.setAttribute("password", password);
		RegisterData regData = new RegisterData(email, password);
		try {
			RegisterData validData = HqlConstants.validUser(regData);
			if (regData.getEmail().equals(validData.getEmail())
					&& regData.getPassword().equals(validData.getPassword())) {
				if (validData.getRole().equals("user")) {

					response.sendRedirect("UserInfo");
				} else if (validData.getRole().equals("admin")) {
					request.getRequestDispatcher("AdminInfo").forward(request, response);
				} else {
					request.getRequestDispatcher("index.html").forward(request, response);
				}
			}
		} catch (Exception ex) {
			request.getRequestDispatcher("index.html").forward(request, response);
		}
	}
}
