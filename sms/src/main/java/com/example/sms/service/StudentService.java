package com.example.sms.service;

import com.example.sms.dto.StudentDTO;
import com.example.sms.dto.StudentSaveDTO;
import com.example.sms.dto.StudentUpdateDTO;

import java.util.List;

public interface StudentService {

    String addStudent(StudentSaveDTO studentSaveDTO);

    List<StudentDTO> getAllStudents();

    String updateStudent(StudentUpdateDTO studentUpdateDTO);

    boolean deleteStudent(int id);
}
