package dev.PlanningProjectConsumer.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.PlanningProjectConsumer.entities.LogEntity;
import dev.PlanningProjectConsumer.repositories.LogEntityRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class LogService {

    private final ObjectMapper objectMapper;
    private final LogEntityRepository logEntityRepository;

    public LogEntity saveLog(String message) throws Exception {
        LogEntity log = objectMapper.readValue(message, LogEntity.class);
        return logEntityRepository.save(log);
    }

}
