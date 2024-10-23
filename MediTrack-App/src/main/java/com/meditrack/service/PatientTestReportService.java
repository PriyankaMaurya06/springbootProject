package com.meditrack.service;

import com.meditrack.entity.PatientTestReport;
import com.meditrack.repository.PatientTestReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientTestReportService {
    @Autowired
    PatientTestReportRepository repository;

    public PatientTestReport addDetail(PatientTestReport patientTestReport) {
        return repository.save(patientTestReport);
    }

    public PatientTestReport getTestReportBymobAndEmail(String mob, String email){
        return repository.findByEmailAndMob(mob, email);
    }
}
