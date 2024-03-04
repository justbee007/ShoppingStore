package edu.neu.csye7374;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
public class SendEmaillTLS {

    public static void send(String Subject, String Body, String emailaddress) {

        final String username = "dpdemo607@gmail.com";
        final String password = "pjfa wwoj iatu ypbn";

        Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS
        
        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("dpdemo607@gmail.com"));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(emailaddress)
            );
            message.setSubject(Subject);
            message.setText(Body);
            Transport.send(message);
        } catch (MessagingException e) {
        	System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
