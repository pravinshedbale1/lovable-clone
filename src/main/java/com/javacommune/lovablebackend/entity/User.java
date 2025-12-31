package com.javacommune.lovablebackend.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class User {
    @Id
    Long id;

    String passwordHash;
    String email;
    String name;
    String avatarUrl;

    Instant createdAt;
    Instant updatedAt;
    Instant deletedAt;
}
