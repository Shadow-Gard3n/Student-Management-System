package com.example.sms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EnrollmentSaveDTO {
    private int student_id;
    private int batch_id;
    private String joindate;
    private int fee;
}