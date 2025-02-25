package com.example.sms.repo;

import com.example.sms.entity.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepo extends JpaRepository<Enrollment,Integer> {
}