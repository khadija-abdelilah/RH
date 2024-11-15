package com.dijachim.notificationservice.service;

import com.dijachim.notificationservice.model.Notification;
import com.dijachim.notificationservice.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    @Autowired
    private NotificationRepository notificationRepository;

    @Autowired
    private JavaMailSender mailSender;

    public Notification sendNotification(Notification notification) {
        // Save notification to the database
        notificationRepository.save(notification);

        // Send email
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(notification.getRecipient());
        mailMessage.setSubject(notification.getSubject());
        mailMessage.setText(notification.getMessage());
        mailSender.send(mailMessage);

        return notification;
    }
}
