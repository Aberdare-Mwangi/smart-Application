package com.mwangi.smartapplication.student;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private long id;
    private String name;
    private LocalDate Dbirth;
    @Transient
    private Integer age;
    private String email;

    public Student(long id, String name, LocalDate dbirth,  String email) {
        this.id = id;
        this.name = name;
        Dbirth = dbirth;
        this.email = email;
    }
    public Student( String name, LocalDate dbirth,  String email) {
        this.name = name;
        Dbirth = dbirth;
        this.email = email;
    }

    public Student() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {

        return Period.between(this.Dbirth,LocalDate.now()).getYears();
    }

    public void setAge(String name) {
        this.age = age;
    }

    public LocalDate getDbirth() {
        return Dbirth;
    }

    public void setDbirth(LocalDate dbirth) {
        Dbirth = dbirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Dbirth=" + Dbirth +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
