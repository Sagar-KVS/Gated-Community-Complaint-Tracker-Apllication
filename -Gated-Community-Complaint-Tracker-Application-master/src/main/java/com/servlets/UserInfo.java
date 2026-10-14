package com.servlets;

import java.io.IOException;
import java.util.List;

import com.model.NewComplaint;
import com.model.RegisterData;
import com.util.HqlConstants;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/UserInfo")
public class UserInfo extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);

		String email = (String) session.getAttribute("email");
		String password = (String) session.getAttribute("password");
		RegisterData regData = new RegisterData(email, password);
		session.setAttribute("email", email);

		List<NewComplaint> complaints = HqlConstants.userComplaints(regData);
		request.setAttribute("complaintsList", complaints);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("userInfo.jsp");
		requestDispatcher.forward(request, response);
	}
}
