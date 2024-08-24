package Package_Sweet;

import javax.mail.*;
import java.util.Properties;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.*;

public class Email_Notification {

    public static final String MANAGER_EMAIL = "s12112361@stu.najah.edu";
    private static final String SENDER_EMAIL = "s12112361@stu.najah.edu";
    private static final String SENDER_PASSWORD = System.getenv("EMAIL_PASSWORD");

    public void sendEmail (String to, String subject, String message){
        String host = "smtp.gmail.com";
        Properties properties = System.getProperties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(SENDER_EMAIL, SENDER_PASSWORD);
            }
        });

        try {
            MimeMessage m = new MimeMessage(session);
            m.setFrom(new InternetAddress(SENDER_EMAIL));
            m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            m.setSubject(subject);
            m.setText(message);

            Transport.send(m);
            JOptionPane.showMessageDialog(null,"A message has been sent to you via Email !");

        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
}
