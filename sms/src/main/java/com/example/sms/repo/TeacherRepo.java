package com.example.sms.repo;


import com.example.sms.entity.Student;
import com.example.sms.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepo extends JpaRepository<Teacher, Integer> {
}
