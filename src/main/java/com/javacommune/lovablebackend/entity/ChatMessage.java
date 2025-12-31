package com.javacommune.lovablebackend.entity;

import com.javacommune.lovablebackend.enums.MessageRole;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@Entity
public class ChatMessage {
    @Id
    Long id;
    String content;
    MessageRole messageRole;
    String toolCalls;
    Integer tokensUsed;
    Instant createdAt;
}
