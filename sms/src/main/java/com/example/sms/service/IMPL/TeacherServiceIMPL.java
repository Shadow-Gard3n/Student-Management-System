package com.example.sms.service.IMPL;

import com.example.sms.dto.StudentDTO;
import com.example.sms.dto.TeacherDTO;
import com.example.sms.dto.TeacherSaveDTO;
import com.example.sms.dto.TeacherUpdateDTO;
import com.example.sms.entity.Student;
import com.example.sms.entity.Teacher;
import com.example.sms.repo.StudentRepo;
import com.example.sms.repo.TeacherRepo;
import com.example.sms.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class TeacherServiceIMPL implements TeacherService {

    @Autowired
    private TeacherRepo teacherRepo;

    @Override
    public List<TeacherDTO> getAllTeachers() {
        List<Teacher> getTeachers = teacherRepo.findAll();
        List<TeacherDTO> teacherDTOList = new ArrayList<>();

        for (Teacher teacher : getTeachers) {
            TeacherDTO teacherDTO = new TeacherDTO(
                    teacher.getTeacherId(),
                    teacher.getTeacherName(),
                    teacher.getAddress(),
                    teacher.getPhone()
            );
            teacherDTOList.add(teacherDTO);
        }
        return teacherDTOList;
    }

    @Override
    public String addTeacher(TeacherSaveDTO teacherSaveDTO) {

        Teacher teacher = new Teacher(
                teacherSaveDTO.getTeacherName(),
                teacherSaveDTO.getAddress(),
                teacherSaveDTO.getPhone()
        );

        teacherRepo.save(teacher);
        return teacher.getTeacherName();
    }

    @Override
    public String updateTeacher(TeacherUpdateDTO teacherUpdateDTO) {
        if (teacherRepo.existsById(teacherUpdateDTO.getTeacherId())){
            Teacher teacher = teacherRepo.getById(teacherUpdateDTO.getTeacherId());
            teacher.setTeacherName(teacherUpdateDTO.getTeacherName());
            teacher.setAddress(teacherUpdateDTO.getAddress());
            teacher.setPhone(teacherUpdateDTO.getPhone());
            teacherRepo.save(teacher);
            return teacher.getTeacherName();
        }
        else {
            System.out.println("Teacher ID not found");
        }
        return "";
    }

    @Override
    public boolean deleteTeacher(int id) {
        if (teacherRepo.existsById(id)){
            teacherRepo.deleteById(id);
            return true;
        }
        else{
            System.out.println("Student ID not found");
            return false;
        }

    }
}
