package com.meditrack.repository;

import com.meditrack.entity.Appointment;
import com.meditrack.entity.MedicalBill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MedicalBillRepository extends JpaRepository<MedicalBill,Long> {

    @Query(value="SELECT * FROM medical_bill WHERE mob=? AND email=?" ,nativeQuery = true)
    MedicalBill findByMobAndEmail(String mob, String email);

}
