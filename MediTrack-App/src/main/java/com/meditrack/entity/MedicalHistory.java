package com.meditrack.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class MedicalHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String patient_name;
    private int age;
    @Column(length=10,nullable = false)
    private String mob;
    private String disease;
    private String email;
    private String diagnosed_by_doctor;
    private String test;
    private String report_remark;
    private String medicine;


}
