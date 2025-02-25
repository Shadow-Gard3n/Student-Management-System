package com.example.sms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BatchUpdateDTO
{
    private int batchid;
    private String batchname;
    private int courseid;
    private String startdate;

}
