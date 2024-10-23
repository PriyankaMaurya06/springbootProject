package com.meditrack.repository;

import com.meditrack.entity.PatientDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientDetailRepository extends JpaRepository<PatientDetail, Long> {
    @Query(value="SELECT * FROM patient_detail WHERE mob=? and email=?" ,nativeQuery = true)
    PatientDetail findByEmailAndMob(String mob, String email);

}
