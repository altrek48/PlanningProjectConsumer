package dev.PlanningProjectConsumer.repositories;

import dev.PlanningProjectConsumer.entities.LogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogEntityRepository extends JpaRepository<LogEntity, Long> {
}
