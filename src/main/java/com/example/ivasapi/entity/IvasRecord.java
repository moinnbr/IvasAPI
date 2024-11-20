//package com.example.ivasapi.model;

package com.example.ivasapi.entity;

import jakarta.persistence.*;

@Entity
public class IvasRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String binNumber;

    @Column(nullable = false)
    private String nid; // National ID

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String areaOfService;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBinNumber() {
        return binNumber;
    }

    public void setBinNumber(String binNumber) {
        this.binNumber = binNumber;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAreaOfService() {
        return areaOfService;
    }

    public void setAreaOfService(String areaOfService) {
        this.areaOfService = areaOfService;
    }
}
