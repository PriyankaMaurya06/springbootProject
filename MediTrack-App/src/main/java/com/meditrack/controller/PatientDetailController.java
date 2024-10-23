package com.meditrack.controller;

import com.meditrack.entity.PatientDetail;
import com.meditrack.service.PatientDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patients")
public class PatientDetailController {
    @Autowired
    PatientDetailService service;
    @PostMapping("/add")
    public PatientDetail addDetail(@RequestBody PatientDetail patientDetail){
        return service.addDetail(patientDetail);
    }

    @PostMapping("/getByEmailAndMob")
    public PatientDetail getPatientByEmailAndMob(@RequestBody PatientDetail patientDetail){
        return service.getPatientByEmailAndMob(patientDetail.getMob(),patientDetail.getEmail());
    }

}
