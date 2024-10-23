package com.meditrack.repository;

import com.meditrack.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    @Query(value="SELECT * FROM appointment WHERE mob=? AND email=?" ,nativeQuery = true)
    Appointment findByMobAndEmail(String mob, String email);

}
