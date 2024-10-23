package com.meditrack.controller;

import com.meditrack.entity.Appointment;
import com.meditrack.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {
    @Autowired
    AppointmentService service;

    @PostMapping("/add")
    public Appointment addDetail(@RequestBody Appointment appointment)
    {
        return service.addDetail(appointment);
    }

    @PostMapping("/getAppointment")
    public Appointment getAppointDetailByMobAndEmail(@RequestBody Appointment appointment)
    {
        return service.getAppointDetailByMobAndEmail(appointment.getMob(),appointment.getEmail());
    }




}
