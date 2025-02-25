package com.example.sms.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="batch")
public class Batch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "batch_id", length = 11)
    private int batchid;

    @Column(name = "batch_name", length = 45)
    private String batchname;

    @Column(name = "start_date", length = 12)
    private String startdate;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;

    @OneToMany(mappedBy = "batch")
    private Set<Enrollment> entrollments;


    public Batch(int batchid, String batchname, String startdate, Course course) {
        this.batchid = batchid;
        this.batchname = batchname;
        this.startdate = startdate;
        this.course = course;
    }

    public Batch() {
    }

    public Batch(String batchname, String startdate, Course course) {
        this.batchname = batchname;
        this.startdate = startdate;
        this.course = course;
    }


    public int getBatchid() {
        return batchid;
    }

    public void setBatchid(int batchid) {
        this.batchid = batchid;
    }

    public String getBatchname() {
        return batchname;
    }

    public void setBatchname(String batchname) {
        this.batchname = batchname;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Batch{" +
                "batchid=" + batchid +
                ", batchname='" + batchname + '\'' +
                ", startdate='" + startdate + '\'' +
                ", course=" + course +
                '}';
    }
}