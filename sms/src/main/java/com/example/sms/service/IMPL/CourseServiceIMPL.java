package com.example.sms.service.IMPL;

import com.example.sms.dto.CourseDTO;
import com.example.sms.dto.CourseSaveDTO;
import com.example.sms.dto.CourseUpdateDTO;
import com.example.sms.entity.Course;
import com.example.sms.repo.CourseRepo;
import com.example.sms.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceIMPL implements CourseService {


    @Autowired
    private CourseRepo courseRepo;

    @Override
    public String addCourse(CourseSaveDTO courseSaveDTO) {

        Course course = new Course(
                courseSaveDTO.getCoursename(),
                courseSaveDTO.getSyllabus(),
                courseSaveDTO.getDuration()
        );
        courseRepo.save(course);
        return course.getCoursename();
    }

    @Override
    public List<CourseDTO> getAllCourses()
    {
        List<Course> getCourses = courseRepo.findAll();
        List<CourseDTO> courseDTOList = new ArrayList<>();
        for(Course course:getCourses)
        {
            CourseDTO courseDTO = new CourseDTO(
                    course.getCourseid(),
                    course.getCoursename(),
                    course.getSyllabus(),
                    course.getDuration()
            );
            courseDTOList.add(courseDTO);
        }
        return courseDTOList;
    }

    @Override
    public String updateCourse(CourseUpdateDTO courseUpdateDTO) {
        if(courseRepo.existsById(courseUpdateDTO.getCourseid()))
        {
            Course course = courseRepo.getById(courseUpdateDTO.getCourseid());
            course.setCoursename(courseUpdateDTO.getCoursename());
            course.setSyllabus(courseUpdateDTO.getSyllabus());
            course.setDuration(courseUpdateDTO.getDuration());

            courseRepo.save(course);
            return course.getCoursename();
        }
        else
        {
            System.out.println("Course ID Not Found");
        }
        return null;
    }

    @Override
    public boolean deleteCourse(int id) {

        if(courseRepo.existsById(id))
        {
            courseRepo.deleteById(id);
        }
        else
        {
            System.out.println("Course ID Not Found");
        }
        return false;
    }

}