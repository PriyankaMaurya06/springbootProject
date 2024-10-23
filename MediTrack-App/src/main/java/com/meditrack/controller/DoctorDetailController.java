package com.meditrack.controller;

import com.meditrack.entity.DoctorDetail;
import com.meditrack.service.DoctorDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/drDetail")
public class DoctorDetailController {
    @Autowired
    DoctorDetailService service;

    @PostMapping("/add")
    public DoctorDetail addDetail(@RequestBody DoctorDetail doctorDetail){
        return service.addDetail(doctorDetail);
    }

    @PostMapping("/drDetail")
    public DoctorDetail getDrDetailByMobAndEmail(@RequestBody DoctorDetail doctorDetail){
        return service.getDrDetailByMobAndEmail(doctorDetail.getMob(),doctorDetail.getEmail());
    }

}
