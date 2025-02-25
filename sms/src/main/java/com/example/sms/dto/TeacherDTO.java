package com.example.sms.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeacherDTO {
    private int teacherId;
    private String teacherName;
    private String address;
    private String phone;
}
