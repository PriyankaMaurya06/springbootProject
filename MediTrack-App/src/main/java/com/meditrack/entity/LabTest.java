package com.meditrack.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class LabTest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long test_id;
    private String test_name;
    private double test_fee;

}
