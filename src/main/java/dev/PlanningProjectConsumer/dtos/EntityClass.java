package dev.PlanningProjectConsumer.dtos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum EntityClass {
    GroupDto,
    UserEntity,
    TaskDto,
    PurchaseDto,
    CredentialsEntity,
    SignInRequest,
    GroupId,
    TaskId;
}
