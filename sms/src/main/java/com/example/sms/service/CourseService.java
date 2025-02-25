package com.example.sms.service;

import com.example.sms.dto.CourseDTO;
import com.example.sms.dto.CourseSaveDTO;
import com.example.sms.dto.CourseUpdateDTO;

import java.util.List;

public interface CourseService {
    String addCourse(CourseSaveDTO courseSaveDTO);

    List<CourseDTO> getAllCourses();

    String updateCourse(CourseUpdateDTO courseUpdateDTO);

    boolean deleteCourse(int id);
}