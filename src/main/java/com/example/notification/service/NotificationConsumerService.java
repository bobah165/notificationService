package com.example.notification.service;

import com.example.notification.dto.Notification;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@AllArgsConstructor
public class NotificationConsumerService {
  private static final String topicCreateOrder = "${topic.send-notification}";
  private static final String kafkaConsumerGroupId = "${spring.kafka.consumer.group-id}";
  private final NotificationService notificationService;

  @Transactional
  @KafkaListener(topics = topicCreateOrder, groupId = kafkaConsumerGroupId, properties = {"spring.json.value.default.type=com.example.notification.dto.Notification"})
  public Notification  createOrder(Notification notification) {
    log.info("Message consumed {}", notification);
    notificationService.save(notification);
    return notification;
  }
}
