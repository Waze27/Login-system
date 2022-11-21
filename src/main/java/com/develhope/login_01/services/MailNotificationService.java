package com.develhope.login_01.services;


import com.develhope.login_01.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailNotificationService {

    @Autowired
    private JavaMailSender mailSender;
    public void sendPasswordResetMail(User userFromDB) {
        SimpleMailMessage sms = new SimpleMailMessage();
        sms.setTo(userFromDB.getEmail());
        sms.setFrom("test_01@gmail.com");
        sms.setReplyTo("test_01@gmail.com");
        sms.setSubject("Correctly enrolled!");
        sms.setText("Activation code is:" + userFromDB.getPasswordResetCode());
        mailSender.send(sms);
    }

    public void sendActivationEmail(User user) {
        SimpleMailMessage sms = new SimpleMailMessage();
        sms.setTo(user.getEmail());
        sms.setFrom("test_01@gmail.com");
        sms.setReplyTo("test_01@gmail.com");
        sms.setSubject("Correctly enrolled!");
        sms.setText("Activation code is:" + user.getActivationCode());
        mailSender.send(sms);
    }
}
