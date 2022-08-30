package com.su.sharding.service;

import com.su.sharding.entry.Patients;

import java.util.List;

public interface PatientService {

    int insertOne(Patients patients);

    Patients  selectById(Long id);

    int update(Patients patients);

    int updateCipher(Patients patients);

    List<Patients> selectAll();
}
