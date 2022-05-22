package javamail;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class JavaMail {

    public static void sendMail(String recepient) throws Exception {
        System.out.println("Preparing to send email");
        Properties properties = new Properties();

        //Enable authentication
        properties.put("mail.smtp.auth", "true");
        //Set TLS encryption enabled
        properties.put("mail.smtp.starttls.enable", "true");
        //Set SMTP host
        properties.put("mail.smtp.host", "smtp.gmail.com");
        //Set smtp port
        properties.put("mail.smtp.port", "587");

        //Your gmail address
        String myAccountEmail = "rayhanahmedrimon44@gmail.com";
        //Your gmail password
        String password = "xxxxxxxxxxx";

        //Create a session with account credentials
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
            @Override  
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccountEmail, password);
            }
        });

        //Prepare email message
        Message message = prepareMessage(session, myAccountEmail, recepient);

        //Send mail
        Transport.send(message);
        System.out.println("Message sent successfully");
    }

    private static Message prepareMessage(Session session, String myAccountEmail, String recepient) {
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject("My First Email from Java App");
            String htmlCode = "<h1> I LOVE JAVA </h1> <br/> <h2><b>Its so beutiful language </b></h2>";
            message.setContent(htmlCode, "text/html");
            return message;
        } catch (Exception ex) {
            Logger.getLogger(MailMainClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}

//private static void sendMail(String reciepent){
//    properties p = new properties()
//    p.put("mail.smtp.auth","true")
//    p.put("mail.smtp.starttls.enable","true")
//    p.put("mail.smtp.host","smtp.gamil.com")
//    p.put("mail.smtp.port","587")
//    String accoutn="xxxxxxxxxx"
//    String password = "xxxxxxxxxxxx"
//    Sassion sassion = Sassion.getInstance(new javax.mail.Authenticator(){
//    @Override  
//            protected PasswordAuthentication getPasswordAuthentication() {
//                return new PasswordAuthention(account,password)
//            }
//})
//    Message message = prepareMessage(sassion,account,reciepent)
//    Transport.send(message)
//    System.out.println("Sent successfully")
//}
//
//private static Message(Sassion sassion,String account,String reciepent){
//    try{
//        Message message = new MimeMessage(sassion)
//        message.setFrom(new InternetAddress(account))
//        message.setReciepent(Message.Reciepent.To,new InternetAddress(reciepent))
//        message.SetSubject("My Email")
//        String content = "my code"
//        message.setContent(content)
//        return message
//}
//}





