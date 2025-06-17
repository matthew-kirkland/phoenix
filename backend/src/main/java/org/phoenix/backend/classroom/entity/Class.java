package org.phoenix.backend.classroom.entity;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.UUID;

public class Class {
    private final String classId;
    private String title;
    private String description;
    private String day;
    private LocalTime startTime;
    private Duration duration;
    private ArrayList<User> tutors;
    private ArrayList<User> students;

    public Class(String title, String description, String day, LocalTime startTime, Duration duration) {
        this.classId = UUID.randomUUID().toString();
        this.setTitle(title);
        this.setDescription(description);
        this.setDay(day);
        this.setStartTime(startTime);
        this.setDuration(duration);
        this.tutors = new ArrayList<User>();
        this.students = new ArrayList<User>();
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

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public ArrayList<User> getTutors() {
        return tutors;
    }

    public ArrayList<User> getStudents() {
        return students;
    }
}
