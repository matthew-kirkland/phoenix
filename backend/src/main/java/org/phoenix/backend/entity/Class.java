package org.phoenix.backend.entity;

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
        this.title = title;
        this.description = description;
        this.day = day;
        this.startTime = startTime;
        this.duration = duration;
        this.tutors = new ArrayList<User>();
        this.students = new ArrayList<User>();
    }

    public String getClassId() {
        return classId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDay() {
        return day;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public Duration getDuration() {
        return duration;
    }

    public ArrayList<User> getTutors() {
        return tutors;
    }

    public ArrayList<User> getStudents() {
        return students;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }
}
