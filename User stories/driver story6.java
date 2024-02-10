import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class NotificationService {



private static final String SENDER_EMAIL = "your_email@gmail.com"; // replace with your email
private static final String SENDER_PASSWORD = "your_email_password"; // replace with your email password
private static final String SMTP_HOST = "smtp.gmail.com";
private static final String SMTP_PORT = "587";

public static void sendNotification(String parentEmail, String message) {
    Properties properties = new Properties();
    properties.put("mail.smtp.auth", "true");
    properties.put("mail.smtp.starttls.enable", "true");
    properties.put("mail.smtp.host", SMTP_HOST);
    properties.put("mail.smtp.port", SMTP_PORT);

    Session session = Session.getInstance(properties, new Authenticator() {
        @Override
        protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(SENDER_EMAIL, SENDER_PASSWORD);
        }
    });

    try {
        Message mailMessage = new MimeMessage(session);
        mailMessage.setFrom(new InternetAddress(SENDER_EMAIL));
        mailMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(parentEmail));
        mailMessage.setSubject("Bus Notification");
        mailMessage.setText(message);

        Transport.send(mailMessage);
        System.out.println("Notification sent successfully to " + parentEmail);
    } catch (MessagingException e) {
        e.printStackTrace();
    }
}

public static void main(String[] args) {
    // Example of sending a notification
    String parentEmail = "parent@example.com";
    String notificationMessage = "Your child has been picked up by the bus and is on the way to school.";
    sendNotification(parentEmail, notificationMessage);
}
}
