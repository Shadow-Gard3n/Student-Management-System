package com.example.sms.controller;

import com.example.sms.dto.EnrollmentDTO;
import com.example.sms.dto.EnrollmentSaveDTO;
import com.example.sms.dto.EnrollmentUpdateDTO;
import com.example.sms.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/enrollment")
public class EnrollmentController {

    @Autowired
    private EnrollmentService enrollmentService;

    @PostMapping(path = "/save")
    public String saveEnrollment(@RequestBody EnrollmentSaveDTO entrollmentSaveDTO)
    {
        String enrollment = enrollmentService.addEnrollment(entrollmentSaveDTO);
        return "enrollment addedd";
    }

    @GetMapping("/getAllEnrollments")
    public List<EnrollmentDTO> getAllEnrollments()
    {
        List<EnrollmentDTO> allEnrollments = enrollmentService.getAllEnrollments();
        return allEnrollments;
    }

    @PutMapping(path = "/update")
    public String updateEnrollment(@RequestBody EnrollmentUpdateDTO enrollmentUpdateDTO)
    {
        String enrollment = enrollmentService.updateEnrollment(enrollmentUpdateDTO);
        return enrollment;

    }

    @DeleteMapping(path = "/delete/{id}")
    public String deleteEnrollment(@PathVariable(value = "id")int id)
    {
        boolean deleteCourse = enrollmentService.deleteEnrollment(id);
        return "DELETED!";

    }

}