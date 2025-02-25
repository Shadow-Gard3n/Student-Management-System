package com.example.sms.service;

import com.example.sms.dto.BatchDTO;
import com.example.sms.dto.BatchSaveDTO;
import com.example.sms.dto.BatchUpdateDTO;

import java.util.List;

public interface BatchService {
    String addBatch(BatchSaveDTO batchSaveDTO);


    List<BatchDTO> getAllBatches();

    String updateBatch(BatchUpdateDTO batchUpdateDTO);

    boolean deleteBatch(int id);
}