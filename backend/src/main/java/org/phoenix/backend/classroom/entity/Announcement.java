package org.phoenix.backend.classroom.entity;

import java.time.LocalDateTime;
import java.util.UUID;

public class Announcement {
    private final String announcementId;
    private final String classId;
    private String title;
    private String message;
    private final LocalDateTime timePosted;

    public Announcement(String classId, String title, String message, LocalDateTime timePosted) {
        this.announcementId = UUID.randomUUID().toString();
        this.classId = classId;
        this.title = title;
        this.message = message;
        this.timePosted = timePosted;
    }

    public String getAnnouncementId() {
        return this.announcementId;
    }

    public String getClassId() {
        return this.classId;
    }

    public String getTitle() {
        return this.title;
    }

    public String getMessage() {
        return this.message;
    }

    public LocalDateTime getTimePosted() {
        return this.timePosted;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
