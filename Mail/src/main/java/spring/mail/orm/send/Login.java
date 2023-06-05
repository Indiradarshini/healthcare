package main.java.spring.mail.orm.send;

public class Login {

	public Login() {
		super();
	}

	String luser;
	String lpass;

	public String getLuser() {
		return luser;
	}

	public void setLuser(String luser) {
		this.luser = luser;
	}

	public String getLpass() {
		return lpass;
	}

	public void setLpass(String lpass) {
		this.lpass = lpass;
	}

	public Login(String luser, String lpass) {
		super();
		this.luser = luser;
		this.lpass = lpass;
	}
}