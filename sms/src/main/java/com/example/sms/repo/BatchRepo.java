package com.example.sms.repo;

import com.example.sms.entity.Batch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BatchRepo extends JpaRepository<Batch,Integer> {
}