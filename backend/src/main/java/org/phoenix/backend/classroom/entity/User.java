package org.phoenix.backend.classroom.entity;

import java.time.LocalDate;
import java.util.UUID;

public abstract class User {
    private final String userId;
    private String email;
    private String password;
    private String phone;
    private String nameFirst;
    private String nameLast;
    private LocalDate DOB;

    public User(String email, String password, String phone, String nameFirst, String nameLast, LocalDate DOB) {
        this.userId = UUID.randomUUID().toString();
        this.setEmail(email);
        this.setPassword(password);
        this.setPhone(phone);
        this.setNameFirst(nameFirst);
        this.setNameLast(nameLast);
        this.setDOB(DOB);
    }

    public String getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNameFirst() {
        return nameFirst;
    }

    public void setNameFirst(String nameFirst) {
        this.nameFirst = nameFirst;
    }

    public String getNameLast() {
        return nameLast;
    }

    public void setNameLast(String nameLast) {
        this.nameLast = nameLast;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }
}
