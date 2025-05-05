package com.ntp.notification_service.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class EmailService {

    @KafkaListener(topics = "test-topic", groupId = "notification-group")
    public void listener(ConsumerRecord<String, String> record) {
        log.info("Key: {}, Value: {}, Offset: {}", record.key(), record.value(), record.offset());
    }
}
