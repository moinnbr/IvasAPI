package com.example.ivasapi.service;

import com.example.ivasapi.model.IvasRecord;
import com.example.ivasapi.repository.IvasRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IvasService {
    @Autowired
    private IvasRecordRepository repository;

    public IvasRecord addRecord(IvasRecord record) {
        repository.findByBinNumber(record.getBinNumber()).ifPresent(existing -> {
            throw new RuntimeException("BIN number must be unique: " + record.getBinNumber());
        });
        return repository.save(record);
    }

    public boolean validateBin(String binNumber) {

        return repository.findByBinNumber(binNumber).isPresent();
    }


}
