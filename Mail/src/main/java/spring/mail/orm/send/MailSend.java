package main.java.spring.mail.orm.send;

import java.util.Properties;
import java.util.UUID;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailSend {

	public void sendEmail(String recipient, String subject, String message) {
		// Configure mail server properties
		Properties properties = new Properties();
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");

		// Set username and password for authentication
		final String username = "madhukar2067@gmail.com";
		final String password = "ygjsartjepgzbmj";

		// Create session with mail server authentication
		javax.mail.Session session = javax.mail.Session.getInstance(properties, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {
			// Create message
			Message emailMessage = new MimeMessage(session);
			emailMessage.setFrom(new InternetAddress(username));
			emailMessage.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
			emailMessage.setSubject(subject);
			emailMessage.setText(message);

			// Send message
			Transport.send(emailMessage);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

	public void sendOTPMail(String recipient, String otp) {
		System.out.println("mail1");

		Properties p = new Properties();
		System.out.println("mail2");
		p.put("mail.smtp.host", "smtp.gmail.com");
		p.put("mail.smtp.auth", true);
		p.put("mail.smtp.starttls.enable", true);
		p.put("mail.smtp.port", "587");
		System.out.println("mail3");
		Session s = Session.getInstance(p, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("yathindranikshipth@gmail.com", "nslq npgk ripj lglk");
			}
		});
		try {
			MimeMessage mm = new MimeMessage(s);
			System.out.println("mail4");
			mm.setFrom(new InternetAddress("yathindranikshipth@gmail.com"));
			mm.setRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
			mm.setSubject("Forget Password");
			mm.setText("OTP TO RESELT PASSWORD" + "your otp for password reset is " + otp
					+ " please use it quickly as IT IS ACTIVE FOR 3MIN ONLY");
			System.out.println("mail5");
			Transport.send(mm);
			System.out.println("mail6");
			System.out.println(
					"your otp for password reset is " + otp + " please use it quickly as IT IS ACTIVE FOR 3MIN ONLY");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String OTPGen() {
		int otpLength = 6; // Length of the OTP

		// Generate the OTP
		StringBuilder otp = new StringBuilder();
		while (otp.length() < otpLength) {
			UUID uuid = UUID.randomUUID();
			otp.append(uuid.toString().replaceAll("-", "").substring(0, otpLength - otp.length()));
		}

		return otp.toString();
	}

}