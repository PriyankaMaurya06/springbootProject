package com.meditrack.service;

import com.meditrack.entity.MedicalHistory;
import com.meditrack.repository.MedicalHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicalHistoryService {
    @Autowired
    MedicalHistoryRepository repository;

    public MedicalHistory addDetail(MedicalHistory medicalHistory) {
       return repository.save(medicalHistory);
    }

    public MedicalHistory getMedicalHistoryByMobAndEmail(String mob, String email) {
        return repository.findByMobAndEmail(mob,email);
    }
}
