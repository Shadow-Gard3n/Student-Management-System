package com.example.sms.controller;

import com.example.sms.dto.*;
import com.example.sms.entity.Teacher;
import com.example.sms.service.StudentService;
import com.example.sms.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @PostMapping("/save")
    public String saveTeacher(@RequestBody TeacherSaveDTO teacherSaveDTO){
        String stname = teacherService.addTeacher(teacherSaveDTO);
        return stname;
    }

    @GetMapping("/getAllTeachers")
    public List<TeacherDTO> getAllTeachers(){
        List<TeacherDTO> allteachers = teacherService.getAllTeachers();
        return allteachers;
    }

    @PutMapping("/update")
    public String updateStudent(@RequestBody TeacherUpdateDTO teacherUpdateDTO){
        String stname = teacherService.updateTeacher(teacherUpdateDTO);
        return stname;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable(value = "id")int id){
        boolean deleteStudent = teacherService.deleteTeacher(id);
        return "Deleted";
    }


}
