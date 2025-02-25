package com.example.sms.entity;

import jakarta.persistence.*;

@Entity
@Table(name="teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="teacher_id",length = 12)
    private int teacherId;

    @Column(name="teacher_name",length = 40)
    private String teacherName;

    @Column(name="address",length = 80)
    private String address;

    @Column(name="phone",length = 10)
    private String phone;

    public Teacher() {
    }

    public Teacher(int teacherId, String teacherName, String address, String phone) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.address = address;
        this.phone = phone;
    }

    public Teacher(String teacherName, String address, String phone) {
        this.teacherName = teacherName;
        this.address = address;
        this.phone = phone;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
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
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", teacherName='" + teacherName + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
