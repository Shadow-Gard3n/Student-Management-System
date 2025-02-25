package com.example.sms.service;

import com.example.sms.dto.EnrollmentDTO;
import com.example.sms.dto.EnrollmentSaveDTO;
import com.example.sms.dto.EnrollmentUpdateDTO;

import java.util.List;

public interface EnrollmentService {
    String addEnrollment(EnrollmentSaveDTO entrollmentSaveDTO);

    List<EnrollmentDTO> getAllEnrollments();

    String updateEnrollment(EnrollmentUpdateDTO enrollmentUpdateDTO);

    boolean deleteEnrollment(int id);
}