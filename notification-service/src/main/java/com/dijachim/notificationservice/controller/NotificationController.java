package com.dijachim.notificationservice.controller;

import com.dijachim.notificationservice.model.Notification;
import com.dijachim.notificationservice.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @PostMapping
    public ResponseEntity<Notification> sendNotification(@RequestBody Notification notification) {
        Notification sentNotification = notificationService.sendNotification(notification);
        return ResponseEntity.ok(sentNotification);
    }
}
