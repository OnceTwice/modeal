package com.ff.modeal.dto;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.ff.modeal.vo.UserVo;

public class Gmail {
	
	
	public static void sendMail(UserVo receiverEmail, String password){
        Properties properties = new Properties();
        properties.put("mail.smtp.user", "dooboo90@gmail.com"); // 구글 계정
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.debug", "true");
        properties.put("mail.smtp.socketFactory.port", "465");
        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.socketFactory.fallback", "false");
        
        try {
            Authenticator auth = new senderAccount();
            Session session = Session.getInstance(properties, auth);
            session.setDebug(true); // 메일을 전송할 때 상세한 상황을 콘솔에 출력한다.
            MimeMessage msg = new MimeMessage(session);
 
            msg.setSubject("Modeal 임시비밀번호 발송");
            Address fromAddr = new InternetAddress("dooboo90@gmail.com"); // 보내는사람 EMAIL
            msg.setFrom(fromAddr);
            Address toAddr = new InternetAddress(receiverEmail.getId());    // 받는사람 EMAIL
            msg.addRecipient(Message.RecipientType.TO, toAddr);
            msg.setContent(toAddr + "님의 Modeal 임시비밀번호는 " + password + "입니다", "text/plain;charset=KSC5601"); // 메일 전송될 내용
            Transport.send(msg);
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    private static class senderAccount extends javax.mail.Authenticator {
 
        public PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication("dooboo90@gmail.com", "lpwwrpoyizauiosl"); // 보내는 사람 ID, PASSWORD
 
        }
    }

}
