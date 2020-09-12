package mail;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.UnsupportedEncodingException;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.security.Security;
import java.util.Date;
import java.util.Properties;
import javax.annotation.Resource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Provider;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import javax.swing.JOptionPane;



/**
 *
 * @author Tem
 */
@Resource
public class EmailController {
//public static void main(String[] args) {
//        new EmailController().envioSimples(
//                "Jhonatas Tomaz", //Remetente
//                "Assunto Daquele Dia", //Assunto
//                "Oi, tudo bem?", //Mensagem
//                "antoniotembe00@gmail.com"); //Email do Destinatário (O EMAIL PRECISA SER VALIDO)
//    }

    public void envioSimples(String nomeRemetente, String assunto, String mensagem, String destinatario) {
        try {
            String host = "smtp.gmail.com";
            String usuario = "antoniotembe00@gmail.com";
            String senha = "843921823";
            String remetente = "antoniotembe00@gmail.com"; //Pode trocar aqui pela String usuario
           
            boolean sessionDebug = true;

            Properties props = System.getProperties();

            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.required", "true");
            props.put("mail.smtp.ssl.trust", "smtp.gmail.com");

            Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            
            Session mailSession = Session.getDefaultInstance(props, null);
            mailSession.setDebug(sessionDebug);
            Message msg = new MimeMessage(mailSession);
            msg.setFrom(new InternetAddress(remetente, nomeRemetente));
            msg.addRecipients(Message.RecipientType.TO, InternetAddress.parse(destinatario));
            msg.setSubject(assunto);
            msg.setSentDate(new Date());
            msg.setContent(mensagem, "text/html;charset=UTF-8");

            Transport transport = mailSession.getTransport("smtp");
            transport.connect(host, usuario, senha);
            transport.sendMessage(msg, msg.getAllRecipients());
            transport.close();

            System.out.println("Enviado com Sucesso");
        } catch (MessagingException ex) {
            //JOptionPane.showMessageDialog(null, "Erro ao enviar email. Você está sem conexão.");
        } catch (UnsupportedEncodingException ex) {
            JOptionPane.showMessageDialog(null, "Destinatário Inválido.");
        }
    }
}
