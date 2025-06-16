package org.phoenix.backend.entity;

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
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.timePosted = timePosted;
    }

    public String getAssignmentId() {
        return this.assignmentId;
    }

    public String getClassId() {
        return this.classId;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }

    public LocalDateTime getDueDate() {
        return this.dueDate;
    }

    public LocalDateTime getTimePosted() {
        return this.timePosted;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }
}
