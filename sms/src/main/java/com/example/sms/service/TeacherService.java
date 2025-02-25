package com.example.sms.service;


import com.example.sms.dto.TeacherDTO;
import com.example.sms.dto.TeacherSaveDTO;
import com.example.sms.dto.TeacherUpdateDTO;

import java.util.List;

public interface TeacherService {

    List<TeacherDTO> getAllTeachers();

    String addTeacher(TeacherSaveDTO teacherSaveDTO);

    String updateTeacher(TeacherUpdateDTO teacherUpdateDTO);

    boolean deleteTeacher(int id);
}
