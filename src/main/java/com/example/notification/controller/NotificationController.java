package com.example.notification.controller;

import com.example.notification.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/notification")
public class NotificationController {

  private final NotificationService notificationService;

  @GetMapping("/currentNotification")
  public ResponseEntity getNotification() {
    var notification = notificationService.findById("1");
    return ResponseEntity.ok(notification.getMessage());
  }
}
