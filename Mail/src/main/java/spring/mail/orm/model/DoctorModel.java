package main.java.spring.mail.orm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Doctors1")
public class DoctorModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "doc_id")
	private int doc_id;
	@Column(name = "doc_name")
	private String doc_name;
	@Column(name = "doc_qual")
	private String doc_qual;
	@Column(name = "spec_id")
	private int spec_id;
	@Column(name = "doc_exp")
	private String doc_exp;
	@Column(name = "doc_photo")
	private byte[] doc_photo;
	@Column(name = "doc_cfee")
	private String doc_cfee;

	public int getDoc_id() {
		return doc_id;
	}

	public void setDoc_id(int doc_id) {
		this.doc_id = doc_id;
	}

	public int getSpec_id() {
		return spec_id;
	}

	public void setSpec_id(int spec_id) {
		this.spec_id = spec_id;
	}

	public String getDoc_name() {
		return doc_name;
	}

	public void setDoc_name(String doc_name) {
		this.doc_name = doc_name;
	}

	public String getDoc_qual() {
		return doc_qual;
	}

	public void setDoc_qual(String doc_qual) {
		this.doc_qual = doc_qual;
	}

	public String getDoc_exp() {
		return doc_exp;
	}

	public void setDoc_exp(String doc_exp) {
		this.doc_exp = doc_exp;
	}

	public byte[] getDoc_photo() {
		return doc_photo;
	}

	public void setDoc_photo(byte[] doc_photo) {
		this.doc_photo = doc_photo;
	}

	public String getDoc_cfee() {
		return doc_cfee;
	}

	public void setDoc_cfee(String doc_cfee) {
		this.doc_cfee = doc_cfee;
	}

	public DoctorModel(int doc_id, String doc_name, String doc_qual, String spec_id, String doc_exp, String doc_photo,
			String doc_cfee) {
		super();
		this.doc_id = doc_id;
		this.doc_name = doc_name;
		this.doc_qual = doc_qual;

		this.doc_exp = doc_exp;
		this.doc_photo = doc_photo;
		this.doc_cfee = doc_cfee;
	}

}
