package com.util;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.SelectionQuery;

import com.model.NewComplaint;
import com.model.RegisterData;

public class HqlConstants {
	public static RegisterData validUser(RegisterData loginData) {

		SessionFactory sessionFact = HibernateUtil.getSessionFactory();
		Session session = sessionFact.openSession();
		SelectionQuery<RegisterData> query = session
				.createSelectionQuery("From RegisterData where email=?1 and password=?2", RegisterData.class);
		query.setParameter(1, loginData.getEmail());
		query.setParameter(2, loginData.getPassword());
		RegisterData user = query.uniqueResult();
		return user;
	}

	public static List<NewComplaint> userComplaints(RegisterData complaint) {

		SessionFactory sessionFact = HibernateUtil.getSessionFactory();
		Session session = sessionFact.openSession();
		SelectionQuery<NewComplaint> query = session.createSelectionQuery("From NewComplaint", NewComplaint.class);
		List complaints = query.list();
		return complaints;
	}
}
