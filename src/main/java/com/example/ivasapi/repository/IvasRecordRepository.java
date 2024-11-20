package com.example.ivasapi.repository;

import com.example.ivasapi.entity.IvasRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface IvasRecordRepository extends JpaRepository<IvasRecord, Long> {
    Optional<IvasRecord> findByBinNumber(String binNumber);
}

