package com.example.sms.controller;

import com.example.sms.dto.StudentDTO;
import com.example.sms.dto.StudentSaveDTO;
import com.example.sms.dto.StudentUpdateDTO;
import com.example.sms.entity.Student;
import com.example.sms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public String getAllStudents(Model model) {
        List<StudentDTO> allStudents = studentService.getAllStudents();
        model.addAttribute("students", allStudents);
        return "student";
    }

    @PostMapping("/save")
    public String saveStudent(@ModelAttribute StudentSaveDTO studentSaveDTO) {
        studentService.addStudent(studentSaveDTO);
        return "redirect:/students";
    }

    @PostMapping("/update")
    public String updateStudent(@ModelAttribute StudentUpdateDTO studentUpdateDTO) {
        studentService.updateStudent(studentUpdateDTO);
        return "redirect:/students";
    }

    @GetMapping("delete/{id}")
    public String deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
        return "redirect:/students";
    }
}
