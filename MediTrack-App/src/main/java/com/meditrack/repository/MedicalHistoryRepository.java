package com.meditrack.repository;

import com.meditrack.entity.MedicalHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MedicalHistoryRepository extends JpaRepository<MedicalHistory,Long> {

    @Query(value ="SELECT * FROM medical_history WHERE mob=? And email=?" ,nativeQuery = true)
    MedicalHistory findByMobAndEmail(String mob, String email);


}
