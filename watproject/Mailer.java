import java.util.Properties;  
  
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
  
public class Mailer 
{  
	public static void sendEmailTo(String name,String email)
	{   
		final String user="goanime96@gmail.com";//change accordingly  
		final String pass="sumevish";  
  
		//1st step) Get the session object    
		Properties props = new Properties();  
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
  
		Session session = Session.getDefaultInstance(props,  
		 new javax.mail.Authenticator() {  
		  protected PasswordAuthentication getPasswordAuthentication() {  
		   return new PasswordAuthentication(user,pass);  
		   }  
		});  
		//2nd step)compose message  
	try {  
		 Message message = new MimeMessage(session);  
		 message.setFrom(new InternetAddress("goanime96@gmail.com"));  
		 message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(email));  
		 message.setSubject("Registration Confirmed!");  
		 message.setText("Thank you"+name+"! You are sucessfully register");  
		   
		 //3rd step)send message  
		 Transport.send(message);    
  
		 } catch (MessagingException e) {  
		    throw new RuntimeException(e);  
			 }  
      
}  
}  