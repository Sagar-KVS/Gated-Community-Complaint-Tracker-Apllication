package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.SelectionQuery;

import com.model.NewComplaint;
import com.model.RegisterData;
import com.util.HibernateUtil;

public class ComplaintsDao {

	public void saveComplaint(NewComplaint complaint, String email) {

		SessionFactory sessionFct = HibernateUtil.getSessionFactory();
		Session session = sessionFct.openSession();
		session.beginTransaction();

		SelectionQuery<RegisterData> query = session.createSelectionQuery("From RegisterData where email=?1",
				RegisterData.class);
		query.setParameter(1, email);
		RegisterData user = query.uniqueResult();
		// int userid = user.getId();

		complaint.setRegisterData(user);
		session.persist(complaint);
		session.getTransaction().commit();
		session.close();
	}

	public void AdminUpdateComplaint(int id, String status) {
		SessionFactory sessionFct = HibernateUtil.getSessionFactory();
		Session session = sessionFct.openSession();
		session.beginTransaction();

		SelectionQuery<NewComplaint> query = session.createSelectionQuery("From NewComplaint where id=?1",
				NewComplaint.class);
		query.setParameter(1, id);
		NewComplaint complaint = query.uniqueResult();
		complaint.setStatus(status);
		int complaintId = complaint.getId();

		session.merge(complaint);
		session.getTransaction().commit();
		session.close();
	}

	public List<NewComplaint> userAllComplaints(String email) {

		SessionFactory sessionFct = HibernateUtil.getSessionFactory();
		Session session = sessionFct.openSession();
		session.beginTransaction();
		SelectionQuery<RegisterData> query = session.createSelectionQuery("From RegisterData where email=?1",
				RegisterData.class);
		query.setParameter(1, email);
		RegisterData user = query.uniqueResult();
		// System.out.println(email);
		// System.out.println(user);
		int userid = (int) user.getId();

		SelectionQuery<NewComplaint> query1 = session.createSelectionQuery(
				" From NewComplaint s where s.registerData.id=?1 AND s.status!=?2", NewComplaint.class);
		query1.setParameter(1, userid);
		query1.setParameter(2, "resolved");
		List complaints = query1.getResultList();
		return complaints;
	}

	public void updateUserComplaint(NewComplaint complaint, String id) {

		SessionFactory sessionFct = HibernateUtil.getSessionFactory();
		Session session = sessionFct.openSession();
		session.beginTransaction();

		SelectionQuery<NewComplaint> query = session.createSelectionQuery("From NewComplaint where id=?1",
				NewComplaint.class);
		query.setParameter(1, id);
		NewComplaint currentComplaint = query.uniqueResult();

		currentComplaint.setName(complaint.getName());
		currentComplaint.setFlatNumber(complaint.getFlatNumber());
		currentComplaint.setDate(complaint.getDate());
		currentComplaint.setPhoneNumber(complaint.getPhoneNumber());
		session.merge(currentComplaint);
		session.getTransaction().commit();
		session.close();
	}

	public void deleteComplaint(String id) {

		SessionFactory sessionFct = HibernateUtil.getSessionFactory();
		Session session = sessionFct.openSession();
		session.beginTransaction();

		int complainId = Integer.parseInt(id);

		MutationQuery query = session.createMutationQuery("Delete From NewComplaint d where d.id=?1");
		query.setParameter(1, id);
		query.executeUpdate();
		session.getTransaction().commit();
		session.close();
	}

	public List<NewComplaint> userViewHistory(String email) {

		SessionFactory sessionFct = HibernateUtil.getSessionFactory();
		Session session = sessionFct.openSession();
		session.beginTransaction();
		SelectionQuery<RegisterData> query = session.createSelectionQuery("From RegisterData where email=?1",
				RegisterData.class);
		query.setParameter(1, email);
		RegisterData user = query.uniqueResult();
		int userid = (int) user.getId();

		SelectionQuery<NewComplaint> query1 = session.createSelectionQuery(
				" From NewComplaint s where s.registerData.id=?1 AND s.status =?2", NewComplaint.class);
		query1.setParameter(1, userid);
		query1.setParameter(2, "resolved");
		List complaints = query1.getResultList();
		return complaints;
	}
}
