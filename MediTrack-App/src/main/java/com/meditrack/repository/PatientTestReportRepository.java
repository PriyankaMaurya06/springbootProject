package com.meditrack.repository;

import com.meditrack.entity.PatientTestReport;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PatientTestReportRepository extends JpaRepository<PatientTestReport, Long> {
    @Query(value="SELECT * FROM patient_test_report WHERE mob=? and email=?" ,nativeQuery = true)
    PatientTestReport findByEmailAndMob(String mob, String email);
}
