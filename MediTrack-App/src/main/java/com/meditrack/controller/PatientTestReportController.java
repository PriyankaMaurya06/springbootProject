package com.meditrack.controller;

import com.meditrack.entity.PatientTestReport;
import com.meditrack.service.PatientTestReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patientTestReport")
public class PatientTestReportController {
    @Autowired
    PatientTestReportService service;

    @PostMapping("/add")
    public PatientTestReport addDetail(@RequestBody PatientTestReport patientTestReport)
    {
        return service.addDetail(patientTestReport);
    }
    @PostMapping("/getTestReport")
    public PatientTestReport getTestReportBymobAndEmail(@RequestBody PatientTestReport  patientTestReport)
    {
        return service.getTestReportBymobAndEmail(patientTestReport.getMob(), patientTestReport.getEmail());
    }
}
