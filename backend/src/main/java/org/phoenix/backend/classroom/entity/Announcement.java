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
        this.setTitle(title);
        this.setMessage(message);
        this.timePosted = timePosted;
    }

    public String getAnnouncementId() {
        return announcementId;
    }

    public String getClassId() {
        return classId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimePosted() {
        return timePosted;
    }
}
