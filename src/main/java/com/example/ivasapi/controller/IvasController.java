package com.example.ivasapi.controller;

import com.example.ivasapi.entity.IvasRecord;
import com.example.ivasapi.service.IvasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ivas")
public class IvasController {
    @Autowired
    private IvasService ivasService;

    @GetMapping("/validate/{binNumber}")
    public ResponseEntity<String> validateBin(@PathVariable String binNumber) {
        boolean isValid = ivasService.validateBin(binNumber);
        if (isValid) {
            return ResponseEntity.ok("BIN is valid");
        } else {
            return ResponseEntity.status(404).body("BIN not found");
        }
    }

    @PostMapping("/add")
    public ResponseEntity<IvasRecord> addRecord(@RequestBody IvasRecord record) {
        IvasRecord newRecord = ivasService.addRecord(record);
        return ResponseEntity.ok(newRecord);
    }
}
