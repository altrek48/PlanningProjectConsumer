package dev.PlanningProjectConsumer.entities;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dev.PlanningProjectConsumer.dtos.EntityClass;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

import java.time.LocalDateTime;

@Entity
@Table(name = "logs")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LogEntity {

    @Transient
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public void setObject(Object obj) throws Exception {
        this.object = objectMapper.writeValueAsString(obj);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.STRING)
    private EntityClass entityClass;

    private String action;

    private LocalDateTime localDateTime;

    @Column(length = 1024)
    private String object;

    private String username;

    private String serviceName;

}
