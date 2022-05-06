package logicaNotificaciones;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import java.util.Properties;
import java.util.Date;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message.RecipientType;
import javax.mail.Multipart;
import javax.mail.Transport;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;

public class CorreoElectronico {

    public void enviarCorreoElectronico(){}
    public void enviarCorreo(String pCorreoElectronico,String pAsuntoCorreo,String pDescripcion){
        try{
            Properties properties= new Properties();
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.starttls.enable", "true");
            properties.put("mail.smtp.host", "smtp.gmail.com");
            properties.put("mail.smtp.port", "587");
            properties.put("mail.smtp.ssl.trust", "*");
            Session session = Session.getDefaultInstance(properties, new Authenticator(){
                @Override
                //Autentica los credenciales de los usuarios
                protected PasswordAuthentication getPasswordAuthentication(){
                    return new PasswordAuthentication("prograsati@gmail.com","prograsati");
                }
            });
            Message message = new MimeMessage(session);
            message.setSubject(pAsuntoCorreo);
            message.setFrom(new InternetAddress("prograsati@gmail.com"));
            message.setRecipient(RecipientType.TO, new InternetAddress(pCorreoElectronico));
            message.setSentDate(new Date());

            Multipart multipart = new MimeMultipart();

            BodyPart bodyPart = new MimeBodyPart();
            bodyPart.setText(pDescripcion);
            multipart.addBodyPart(bodyPart);

            message.setContent(multipart);
            //proporciona un mensaje de tipo alerta para confirmar que el correo electronico fue enviado.
            Transport.send(message);
        }catch(Exception e){JOptionPane.showMessageDialog(null, e.getMessage());}
    }
}
