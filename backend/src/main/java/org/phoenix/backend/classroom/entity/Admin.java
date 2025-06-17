package org.phoenix.backend.classroom.entity;

import java.time.LocalDate;

public class Admin extends User {
    public Admin(String email, String password, String phone, String nameFirst, String nameLast, LocalDate DOB) {
        super(email, password, phone, nameFirst, nameLast, DOB);
    }
}
