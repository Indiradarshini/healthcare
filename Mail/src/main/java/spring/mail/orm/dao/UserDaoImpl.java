package main.java.spring.mail.orm.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import main.java.spring.mail.orm.model.DoctorModel;
import main.java.spring.mail.orm.model.UserPass;

@Repository
public class UserDaoImpl implements UserDao {
	@PersistenceContext
	private EntityManager em;

	public UserPass getUserDetails(String uname) {
		try {
			String sql = "SELECT u FROM UserPass u WHERE u.username = :uname";
			TypedQuery<UserPass> query = em.createQuery(sql, UserPass.class).setParameter("uname", uname);
			return query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}

	public boolean saveUser(String ottps, int time) {
		StoredProcedureQuery query = em.createStoredProcedureQuery("is_otp_expired");
		// Register the input parameters
		query.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);

		// Set the input parameters
		query.setParameter(1, ottps);
		query.setParameter(2, 3);
		query.execute();

		boolean isExpired = (boolean) query.getSingleResult();
		return isExpired;
	}

	public void updateUser(String lcpass, String uname) {
		StoredProcedureQuery query = em.createStoredProcedureQuery("update_ma_mail_user");
		System.out.println("Ored");
		// Set the input parameters
		query.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
		System.out.println("Expired");
		query.setParameter(1, lcpass);
		query.setParameter(2, uname);
		System.out.println("ed");
		// Execute the procedure
		query.execute();
	}

	public void changeUser(String lcpass, String uname) {
		StoredProcedureQuery query = em.createStoredProcedureQuery("update_ma_mail_user");
		query.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
		System.out.println("Expired");
		query.setParameter(1, lcpass);
		query.setParameter(2, uname);
		System.out.println("ed");
		query.execute();

	}

	public void registeruser(String name, String pass, String mail, String role) {
		StoredProcedureQuery query = em.createStoredProcedureQuery("insert_ma_mail_user");
		System.out.println("called");
		query.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);

		query.setParameter(1, name);
		query.setParameter(2, pass);
		query.setParameter(3, mail);
		query.setParameter(4, role);
		query.execute();
		System.out.println("inserted");

	}

	public DoctorModel getdocspecdetails() {
		try {
			String sql = "SELECT d FROM DoctorModel d";
			TypedQuery<DoctorModel> query = em.createQuery(sql, DoctorModel.class);
			return query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}

	}

	public void savedoc(String doc_name, String doc_qual, int spec_id, String doc_exp, byte[] doc_photo, int doc_cfee) {
		StoredProcedureQuery query = em.createStoredProcedureQuery("insert_doc");
		System.out.println("called");
		query.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(3, Integer.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(5, Byte.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(6, Integer.class, ParameterMode.IN);

		query.setParameter(1, doc_name);
		query.setParameter(2, doc_qual);
		query.setParameter(3, spec_id);
		query.setParameter(4, doc_exp);
		query.setParameter(5, doc_photo);
		query.setParameter(6, doc_cfee);

		query.execute();
		System.out.println("inserted");
	}
}