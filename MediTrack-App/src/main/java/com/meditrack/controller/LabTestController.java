package com.meditrack.controller;

import com.meditrack.entity.LabTest;
import com.meditrack.service.LabTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/labTest")
public class LabTestController {
    @Autowired
    LabTestService service;

    @PostMapping("/add")
    public LabTest addDetail(@RequestBody LabTest labTest) {
        return service.addDetail(labTest);
    }

    @PostMapping("/getByTestName")
    public LabTest getByTestName(@RequestBody LabTest labTest) {
        return service.getByTestName(labTest.getTest_name());
    }
}