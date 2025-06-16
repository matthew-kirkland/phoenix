package org.phoenix.backend.entity;

import java.time.LocalDateTime;
import java.util.UUID;

public class Token {
    private final String sessionId;
    private final String userId;
    private final UserType userType;
    private final LocalDateTime timeIssued;

    public Token(String userId, UserType userType) {
        sessionId = UUID.randomUUID().toString();
        this.userId = userId;
        this.userType = userType;
        timeIssued = LocalDateTime.now();
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public String getUserId() {
        return this.userId;
    }

    public UserType getUserType() {
        return this.userType;
    }

    public LocalDateTime getTimeIssued() {
        return this.timeIssued;
    }
}
