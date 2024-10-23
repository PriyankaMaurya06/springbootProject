package com.meditrack.service;

import com.meditrack.entity.LabTest;
import com.meditrack.repository.LabTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LabTestService {
    @Autowired
    LabTestRepository repository;

    public LabTest addDetail(LabTest labTest) {
        return repository.save(labTest);
    }

    public LabTest getByTestName(String test_name) {
        return repository.findByName(test_name);
    }
}
