package com.meditrack.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jdk.jshell.SourceCodeAnalysis;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DoctorDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long dr_id;
    private String name;
    private String mob;
    private String email;
    private String specialization;
    private String qualification;
    private String experience;
}
