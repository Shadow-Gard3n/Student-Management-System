package com.example.sms.entity;

import jakarta.persistence.*;

@Entity
@Table(name="enrollment")
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="enroll_id",length = 11)
    private int enrollid;

    @ManyToOne
    @JoinColumn(name = "student_id",nullable = false)
    private Student student;


    @ManyToOne
    @JoinColumn(name = "batch_id",nullable = false)
    private Batch batch;


    @Column(name="join_date",length = 12)
    private String joindate;


    @Column(name="fee",length = 12)
    private int fee;

    public Enrollment(int enrollid, Student student, Batch batch, String joindate, int fee) {
        this.enrollid = enrollid;
        this.student = student;
        this.batch = batch;
        this.joindate = joindate;
        this.fee = fee;
    }


    public Enrollment() {
    }


    public Enrollment(Student student, Batch batch, String joindate, int fee) {
        this.student = student;
        this.batch = batch;
        this.joindate = joindate;
        this.fee = fee;
    }

    public int getEnrollid() {
        return enrollid;
    }

    public void setEnrollid(int enrollid) {
        this.enrollid = enrollid;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Batch getBatch() {
        return batch;
    }

    public void setBatch(Batch batch) {
        this.batch = batch;
    }

    public String getJoindate() {
        return joindate;
    }

    public void setJoindate(String joindate) {
        this.joindate = joindate;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Entrollment{" +
                "enrollid=" + enrollid +
                ", student=" + student +
                ", batch=" + batch +
                ", joindate='" + joindate + '\'' +
                ", fee=" + fee +
                '}';
    }
}