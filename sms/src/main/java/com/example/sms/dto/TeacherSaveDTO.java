package com.example.sms.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TeacherSaveDTO {
    private String teacherName;
    private String address;
    private String phone;

}
