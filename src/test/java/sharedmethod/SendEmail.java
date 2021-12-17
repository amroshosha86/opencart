package sharedmethod;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendEmail {

	public static void main(String[] args) throws EmailException {


		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("amro.mohamed1952@gmail.com","Asd123zxc"));
		email.setSSLOnConnect(true);
		email.setFrom("amro.mohamed1952@gmail.net");
		email.setSubject("Selenium");
		email.setMsg("Selenium"); 
		email.addTo("amro.mohamed19529@gmail.net");
		email.send();



	}
}
