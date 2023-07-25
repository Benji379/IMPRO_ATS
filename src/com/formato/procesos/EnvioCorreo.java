/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.formato.procesos;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author Benji
 */
public class EnvioCorreo {

    private static final String EMAILFORM = "improats@gmail.com";
    private static final String PASSWORDFROM = "xflggoloxiqttmyj";
    private String emailTo;//direccion hacia donde voy a enviar el correo
    private String subject;//asunto
    private String content;//contenido

    private final Properties mProperties;
    private Session mSession;
    private MimeMessage mCorreo;

    public EnvioCorreo() {
        mProperties = new Properties();
    }

    public static void EnviarEmail(String direccionEmail, String asunto, String contenido) {
        EnvioCorreo k = new EnvioCorreo();
        k.createEmail(direccionEmail, asunto, contenido);
        k.sendEmail();
    }

    private void createEmail(String direccionEmail, String asunto, String contenido) {
        emailTo = direccionEmail.trim();
        subject = asunto.trim();
        content = contenido.trim();

        // Simple mail transfer protocol
        mProperties.put("mail.smtp.host", "smtp.gmail.com");
        mProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        mProperties.setProperty("mail.smtp.starttls.enable", "true");
        mProperties.setProperty("mail.smtp.port", "587");
        mProperties.setProperty("mail.smtp.user", EMAILFORM);
        mProperties.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
        mProperties.setProperty("mail.smtp.auth", "true");

        mSession = Session.getDefaultInstance(mProperties);

        try {
            mCorreo = new MimeMessage(mSession);
            mCorreo.setFrom(new InternetAddress(EMAILFORM));
            mCorreo.setRecipient(Message.RecipientType.TO, new InternetAddress(emailTo));
            mCorreo.setSubject(subject);
            mCorreo.setText(content, "ISO-8859-1", "html");

        } catch (AddressException ex) {
//            Logger.getLogger(EnvioCorreo.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR: No se encontro correo", "Error",JOptionPane.ERROR_MESSAGE);
        } catch (MessagingException ex) {
//            Logger.getLogger(EnvioCorreo.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR: No se encontro correo", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    private void sendEmail() {
        try {
            Transport mTransport = mSession.getTransport("smtp");
            mTransport.connect(EMAILFORM, PASSWORDFROM);
            mTransport.sendMessage(mCorreo, mCorreo.getRecipients(Message.RecipientType.TO));
            mTransport.close();

            JOptionPane.showMessageDialog(null, "Correo enviado");
        } catch (NoSuchProviderException ex) {
//            Logger.getLogger(EnvioCorreo.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR: No se encontro correo", "Error",JOptionPane.ERROR_MESSAGE);
        } catch (MessagingException ex) {
//            Logger.getLogger(EnvioCorreo.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR: No se encontro correo", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }

}
