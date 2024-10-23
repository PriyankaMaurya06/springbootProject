package com.meditrack.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
//@Entity(name:"xyz") to change table name
public class PatientDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String gender;

    private int age;
    @Column(length=10,nullable = false)
    private String mob;
//    @Column(length = 50)
   private String email;
   private String address;
   private LocalDate dateOfRegisteration;
   @Column(unique = true)
   private String aadharID;
}
