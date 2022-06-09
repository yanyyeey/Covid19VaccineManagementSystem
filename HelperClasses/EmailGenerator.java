package HelperClasses;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmailGenerator {

    public static void sendEmail(String recepient, String msg, String subject) throws MessagingException {
        System.out.println("Preparing to send email!");
        Properties properties = new Properties();

        //always require username and password to authenticate the account
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.required", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.starttls.required", "true");
        properties.put("mail.smtp.ssl.protocols", "TLSv1.2");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
        
        String myAccountEmail = "slleeyifoo@gmail.com";
        String password = "35TqY8y9yb ";

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccountEmail, password);
            }
        });

        Message message = prepareMessage(session, myAccountEmail, recepient, msg, subject);

        Transport.send(message);
        System.out.println("Message send successfully!");
    }

    public static Message prepareMessage(Session session, String myAccountEmail, String recepient, String msg, String subject) {
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject(subject);
            message.setText(msg);
            return message;
        } catch (MessagingException ex) {
            Logger.getLogger(EmailGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
