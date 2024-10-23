package com.meditrack.service;

import com.meditrack.entity.DoctorDetail;
import com.meditrack.repository.DoctorDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorDetailService {
    @Autowired
    DoctorDetailRepository repository;

    public DoctorDetail addDetail(DoctorDetail doctorDetail) {
       return repository.save(doctorDetail);
    }

    public DoctorDetail getDrDetailByMobAndEmail(String mob,String email) {
        return repository.findByMobAndEmail(mob,email);
    }

}
