package com.meditrack.service;

import com.meditrack.entity.PatientDetail;
import com.meditrack.repository.PatientDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientDetailService {
    @Autowired
    PatientDetailRepository repository;
    public PatientDetail addDetail(PatientDetail patientDetail) {
        return repository.save(patientDetail);
    }


    public PatientDetail getPatientByEmailAndMob(String mob, String email) {
        return repository.findByEmailAndMob(mob, email);
    }

}
