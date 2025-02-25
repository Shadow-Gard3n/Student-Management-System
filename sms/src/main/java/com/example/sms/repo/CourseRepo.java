package com.example.sms.repo;

import com.example.sms.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course,Integer> {
}