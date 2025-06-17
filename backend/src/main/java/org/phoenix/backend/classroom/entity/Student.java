package org.phoenix.backend.classroom.entity;

import java.time.LocalDate;
import java.util.ArrayList;

public class Student extends User {
    private String school;
    private int year;
    private boolean emailNotif;
    private boolean smsNotif;
    private ArrayList<Class> lessons;

    public Student(String email, String password, String phone, String nameFirst, String nameLast, LocalDate DOB, String school, int year) {
        super(email, password, phone, nameFirst, nameLast, DOB);
        this.setSchool(school);
        this.setYear(year);
        this.setEmailNotif(true);
        this.setSmsNotif(true);
        this.lessons = new ArrayList<Class>();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isEmailNotif() {
        return emailNotif;
    }

    public void setEmailNotif(boolean emailNotif) {
        this.emailNotif = emailNotif;
    }

    public boolean isSmsNotif() {
        return smsNotif;
    }

    public void setSmsNotif(boolean smsNotif) {
        this.smsNotif = smsNotif;
    }

    public ArrayList<Class> getLessons() {
        return lessons;
    }
}
