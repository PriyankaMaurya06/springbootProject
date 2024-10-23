package com.meditrack.repository;

import com.meditrack.entity.DoctorDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DoctorDetailRepository extends JpaRepository<DoctorDetail,Long> {
    @Query(value = "SELECT * FROM doctor_detail WHERE mob=? AND email=?" ,nativeQuery = true)
    DoctorDetail findByMobAndEmail(String mob,String email);
}
