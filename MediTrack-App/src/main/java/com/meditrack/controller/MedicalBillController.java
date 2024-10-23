package com.meditrack.controller;

import com.meditrack.entity.MedicalBill;
import com.meditrack.service.MedicalBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicalBill")
public class MedicalBillController {
    @Autowired
    MedicalBillService service;

    @PostMapping("/add")
    public MedicalBill addDetail(@RequestBody MedicalBill medicalBill){
        return service.addDetail(medicalBill);
    }
    @PostMapping("/getMedicalBill")
    public MedicalBill getMedicalBillByMobAndEmail(@RequestBody MedicalBill medicalBill){
        return service.getMedicalBillByMobAndEmail(medicalBill.getMob(),medicalBill.getEmail());
    }
}
