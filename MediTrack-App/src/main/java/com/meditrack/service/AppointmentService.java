package com.meditrack.service;

import com.meditrack.entity.Appointment;
import com.meditrack.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class AppointmentService {
    @Autowired
    AppointmentRepository repository;

    public Appointment addDetail(Appointment appointment) {
        return repository.save(appointment);
    }

    public Appointment getAppointDetailByMobAndEmail(String mob,String email) {

        return repository.findByMobAndEmail(mob,email);
    }
}
