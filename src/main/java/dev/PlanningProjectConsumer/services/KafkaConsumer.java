package dev.PlanningProjectConsumer.services;

import dev.PlanningProjectConsumer.entities.LogEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaConsumer {

    private final LogService logService;

    @KafkaListener(topics = "user_actions", groupId = "consumers")
    public void listen(String message) throws Exception {
        log.info("Message:  " + message);
        LogEntity savedLog = logService.saveLog(message);
        log.info("saved log: " + savedLog);
    }

}
