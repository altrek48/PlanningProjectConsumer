package dev.PlanningProjectConsumer.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import dev.PlanningProjectConsumer.dtos.EntityClass;
import dev.PlanningProjectConsumer.services.converters.StringConverter;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.annotations.Type;
import org.hibernate.type.SqlTypes;

import java.time.LocalDateTime;

@Entity
@Table(name = "logs")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LogEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.STRING)
    private EntityClass entityClass;

    private String action;

    private LocalDateTime localDateTime;

    @Column(length = 1024)
    @JdbcTypeCode(SqlTypes.JSON)
    @Convert(converter = StringConverter.class)
    private Object object;

    private String username;

    private String serviceName;

    private String exception;
}
