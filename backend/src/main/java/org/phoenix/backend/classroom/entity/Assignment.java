package org.phoenix.backend.classroom.entity;

import java.time.LocalDateTime;
import java.util.UUID;

public class Assignment {
    private final String assignmentId;
    private final String classId;
    private String title;
    private String description;
    private LocalDateTime dueDate;
    private final LocalDateTime timePosted;

    public Assignment(String classId, String title, String description, LocalDateTime dueDate, LocalDateTime timePosted) {
        this.assignmentId = UUID.randomUUID().toString();
        this.classId = classId;
        this.setTitle(title);
        this.setDescription(description);
        this.setDueDate(dueDate);
        this.timePosted = timePosted;
    }

    public String getAssignmentId() {
        return assignmentId;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDateTime getTimePosted() {
        return timePosted;
    }
}
