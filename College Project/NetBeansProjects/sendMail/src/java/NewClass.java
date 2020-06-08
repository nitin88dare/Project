import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class NewClass
{
    public static void main(String[] args) throws Exception
    {
        String host="smtp.emailmyname.com";
        String from="nitin88dare@gmail.com";
        String to="nitin_88dare@yahoo.com";
        Properties prop = System.getProperties();
        prop.put("mail.smtp.host", host);
        Session ses1=Session.getDefaultInstance(prop, null);
        MimeMessage msg= new MimeMessage(ses1);
        msg.setFrom(new InternetAddress(from));
        msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
        msg.setSubject("Urgent");
        msg.setText("I am the master of Universe");
        Transport.send(msg);
    }
}
