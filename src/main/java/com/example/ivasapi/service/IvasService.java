package com.example.ivasapi.service;

import com.example.ivasapi.entity.IvasRecord;
import com.example.ivasapi.repository.IvasRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class IvasService {
    @Autowired
    private IvasRecordRepository repository;

    public boolean validateBin(String binNumber) {
        return repository.findByBinNumber(binNumber).isPresent();
    }

    public IvasRecord addRecord(IvasRecord record) {
        return repository.save(record);
    }
}
