package com.example.busmanagementsystem.Student;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;

@Getter
@Setter

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
    private  String address;
    private  String dept;
    private String defaultRoute;
    private Integer balance;

    public Student() {
    }

    public Student(long l, String name, String address, String dept, String defaultRoute, Integer balance) {
        this.name = name;
        this.address = address;
        this.dept = dept;
        this.defaultRoute = defaultRoute;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "StudentController{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", dept='" + dept + '\'' +
                ", defaultRoute='" + defaultRoute + '\'' +
                ", balance=" + balance +
                '}';
    }
}