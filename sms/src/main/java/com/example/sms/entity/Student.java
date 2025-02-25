package com.example.sms.entity;

import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="student_id",length = 12)
    private int studentId;

    @Column(name="student_name",length = 40)
    private String studentName;

    @Column(name="address",length = 80)
    private String address;

    @Column(name="phone",length = 10)
    private String phone;

    public Student() {

    }

    public Student(int studentId, String studentName, String address, String phone) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.address = address;
        this.phone = phone;
    }

    public Student(String studentName, String address, String phone) {
        this.studentName = studentName;
        this.address = address;
        this.phone = phone;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentId=" + studentId +
                ", StudentName='" + studentName + '\'' +
                ", Address='" + address + '\'' +
                ", Phone='" + phone + '\'' +
                '}';
    }
}
