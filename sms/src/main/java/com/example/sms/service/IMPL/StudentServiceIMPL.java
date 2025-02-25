package com.example.sms.service.IMPL;

import com.example.sms.dto.StudentDTO;
import com.example.sms.dto.StudentSaveDTO;
import com.example.sms.dto.StudentUpdateDTO;
import com.example.sms.entity.Student;
import com.example.sms.repo.StudentRepo;
import com.example.sms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceIMPL implements StudentService {

    @Autowired
    private StudentRepo studentRepo;


    @Override
    public String addStudent(StudentSaveDTO studentSaveDTO) {

        Student student = new Student(
                studentSaveDTO.getStudentName(),
                studentSaveDTO.getAddress(),
                studentSaveDTO.getPhone()
        );

        studentRepo.save(student);
        return student.getStudentName();
    }

    @Override
    public List<StudentDTO> getAllStudents() {
        List<Student> getStudents = studentRepo.findAll();
        List<StudentDTO> studentDTOList = new ArrayList<>();

        for (Student student : getStudents) {
            StudentDTO studentDTO = new StudentDTO(
                    student.getStudentId(),
                    student.getStudentName(),
                    student.getAddress(),
                    student.getPhone()
            );
            studentDTOList.add(studentDTO);
        }
        return studentDTOList;
    }

    @Override
    public String updateStudent(StudentUpdateDTO studentUpdateDTO) {
        if (studentRepo.existsById(studentUpdateDTO.getStudentId())){
            Student student = studentRepo.getById(studentUpdateDTO.getStudentId());
            student.setStudentName(studentUpdateDTO.getStudentName());
            student.setAddress(studentUpdateDTO.getAddress());
            student.setPhone(studentUpdateDTO.getPhone());
            studentRepo.save(student);
            return student.getStudentName();

        }
        else{
            System.out.println("Student ID not found");
        }
        return "";
    }

    @Override
    public boolean deleteStudent(int id) {
        if (studentRepo.existsById(id)){
            studentRepo.deleteById(id);
            return true;
        }
        else{
            System.out.println("Student ID not found");
            return false;
        }

    }


}
