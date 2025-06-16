package org.phoenix.backend.entity;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class User {
    private final String userId;
    private UserType userType;
    private String email;
    private String password;
    private String phone;
    private String nameFirst;
    private String nameLast;
    private String school;
    private int year;
    private LocalDate DOB;
    private boolean emailNotif;
    private boolean smsNotif;
    private ArrayList<Class> lessons;
    private ArrayList<Class> classes;
    private ArrayList<User> children;

    public User(String email, UserType userType, String password, String phone, String nameFirst, String nameLast, String school, int year, LocalDate DOB) throws NoSuchAlgorithmException {
        this.userId = UUID.randomUUID().toString();
        this.userType = userType;
        this.email = email;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(password.getBytes());
        this.password = new String(messageDigest.digest());
        this.phone = phone;
        this.nameFirst = nameFirst;
        this.nameLast = nameLast;
        this.school = school;
        this.year = year;
        this.DOB = DOB;
        this.emailNotif = true;
        this.smsNotif = true;
        this.lessons = new ArrayList<Class>();
        this.classes = new ArrayList<Class>();
        this.children = new ArrayList<User>();
    }

    public String getUserId() {
        return this.userId;
    }

    public UserType getUserType() {
        return this.userType;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getNameFirst() {
        return nameFirst;
    }

    public String getNameLast() {
        return nameLast;
    }

    public String getSchool() {
        return school;
    }

    public int getYear() {
        return year;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public boolean isEmailNotif() {
        return emailNotif;
    }

    public boolean isSmsNotif() {
        return smsNotif;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setNameFirst(String nameFirst) {
        this.nameFirst = nameFirst;
    }

    public void setNameLast(String nameLast) {
        this.nameLast = nameLast;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public void setEmailNotif(boolean emailNotif) {
        this.emailNotif = emailNotif;
    }

    public void setSmsNotif(boolean smsNotif) {
        this.smsNotif = smsNotif;
    }
}
