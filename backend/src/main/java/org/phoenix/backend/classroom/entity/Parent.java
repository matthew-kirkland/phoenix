package org.phoenix.backend.classroom.entity;

import java.time.LocalDate;
import java.util.ArrayList;

public class Parent extends User {
    private boolean emailNotif;
    private boolean smsNotif;
    private ArrayList<Student> children;

    public Parent(String email, String password, String phone, String nameFirst, String nameLast, LocalDate DOB) {
        super(email, password, phone, nameFirst, nameLast, DOB);
        this.setEmailNotif(true);
        this.setSmsNotif(true);
        this.children = new ArrayList<Student>();
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

    public ArrayList<Student> getChildren() {
        return children;
    }
}
