package com.su.sharding.service;

import com.su.sharding.entry.Patients;

import java.util.List;

/**
 * @author subo
 */
public interface PatientService {

    int insertOne(Patients patients);

    int  batchInsert(List<Patients> list);

    Patients  selectById(Long id);

    int update(Patients patients);

    int updateCipher(Patients patients);

    List<Patients> selectAll();
}
