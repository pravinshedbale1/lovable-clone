package com.javacommune.lovablebackend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Project {
    @Id
    Long id;
    String name;
    User owner;
    Boolean isPublic = false;
    Instant createdAt;
    Instant updatedAT;
    Instant deletedAt;

}
