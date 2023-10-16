package com.Backend.Shema.Model;
import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.springframework.stereotype.Component;

@Component
public class Mail {
	public void sendEmail(String emailRecever,String mdp)
	{
		try
		{
			Properties props = new Properties();
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.port", "587");
			props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
			Session session = Session.getInstance(props, new javax.mail.Authenticator()
			{
				protected PasswordAuthentication getPasswordAuthentication()
				{
					return new PasswordAuthentication("itns.services.mdp@gmail.com", "zhpl pmvg qzmt dobi");
				}
			});
			Message msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress("itns.services.mdp@gmail.com", false));

			msg.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(emailRecever));
			msg.setSubject("Recupération du mot de passe");
			msg.setSentDate(new Date());

			MimeBodyPart messageBodyPart = new MimeBodyPart();
			messageBodyPart.setContent("Bonjour Utilisateur "+"\n\r Nous avons reçu une demande de récupération de mot de passe pour votre compte. Pour récupérer votre mot de passe, veuillez scanner le code QR ci-dessous :"
					+  "\n\r Cordialement",
					"text/html");

			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(messageBodyPart);

			MimeBodyPart attachPart = new MimeBodyPart();
			attachPart.attachFile("./src/main/resources/Qrcodes/"+emailRecever+".png");
			multipart.addBodyPart(attachPart);
			msg.setContent(multipart);
			Transport.send(msg);
		}
		catch (Exception exe)
		{
			exe.printStackTrace();
		}
	}
}