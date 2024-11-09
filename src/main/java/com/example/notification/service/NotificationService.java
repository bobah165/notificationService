package com.example.notification.service;

import com.example.notification.dto.Notification;
import com.example.notification.repository.NotificationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
public class NotificationService {

  private final NotificationRepository repository;

  @Transactional
  public void save(Notification notification) {
    repository.save(notification);
  }

  @Transactional
  public Notification findById(String id){
    return repository.findById(id).get();
  }
}
