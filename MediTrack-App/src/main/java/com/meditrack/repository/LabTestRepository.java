package com.meditrack.repository;

import com.meditrack.entity.LabTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LabTestRepository extends JpaRepository<LabTest, Long> {
    @Query(value = "SELECT * FROM lab_test WHERE test_name=?" ,nativeQuery = true)
    LabTest findByName(String testName);
}
