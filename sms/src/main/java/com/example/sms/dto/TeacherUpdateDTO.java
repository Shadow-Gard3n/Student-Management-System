package com.example.sms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TeacherUpdateDTO {
    private int teacherId;
    private String teacherName;
    private String address;
    private String phone;

}
