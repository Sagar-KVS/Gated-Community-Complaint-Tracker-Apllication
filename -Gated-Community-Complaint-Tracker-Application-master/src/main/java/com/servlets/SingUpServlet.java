package com.servlets;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.RegisterData;
import com.util.HibernateUtil;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/SingUpServlet")
public class SingUpServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String role = request.getParameter("Role");

		RegisterData userInfo = new RegisterData(name, email, password, role);
		SessionFactory sessionFact = HibernateUtil.getSessionFactory();
		Session session = sessionFact.openSession();
		session.beginTransaction();
		session.persist(userInfo);
		session.getTransaction().commit();
		session.close();

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.html");
		requestDispatcher.forward(request, response);
	}

}
