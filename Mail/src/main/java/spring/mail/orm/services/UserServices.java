package main.java.spring.mail.orm.services;

import org.springframework.beans.factory.annotation.Autowired;

import main.java.spring.mail.orm.dao.UserDao;
import main.java.spring.mail.orm.model.DoctorModel;
import main.java.spring.mail.orm.model.UserPass;

public class UserServices {
	@Autowired
	private UserDao udao;

	public UserPass getUser(String uname) {
		return udao.getUserDetails(uname);
	}

	public boolean saveUser(String ottps, int time) {
		return udao.saveUser(ottps, time);
	}

	public void updateUser(String lcpass, String uname) {
		udao.updateUser(lcpass, uname);
	}

	public void changeUser(String lcpass, String uname) {
		udao.changeUser(lcpass, uname);
	}

	public void registeruser(String name, String pass, String mail, String role) {
		udao.registeruser(name, pass, mail, role);

	}

	public DoctorModel getdocspecdetails() {
		return udao.getdocspecdetails();

	}

	public void savedoc(String doc_name, String doc_qual, int spec_id, String doc_exp, byte[] doc_photo, int doc_cfee) {
		udao.savedoc(doc_name, doc_qual, spec_id, doc_exp, doc_photo, doc_cfee);
	}
}