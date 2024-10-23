package com.meditrack.service;

import com.meditrack.entity.Appointment;
import com.meditrack.entity.MedicalBill;
import com.meditrack.repository.MedicalBillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicalBillService {
    @Autowired
    MedicalBillRepository repository;

    public MedicalBill addDetail(MedicalBill bill) {
        bill.setTotal_charge(bill.getMedicine_charge()+bill.getDr_charge() + bill.getLab_charge() + bill.getCleaning_charge() + bill.getBed_charge());
        return repository.save(bill);
}
    public MedicalBill getMedicalBillByMobAndEmail(String mob, String email) {

        return repository.findByMobAndEmail(mob,email);
    }
}
