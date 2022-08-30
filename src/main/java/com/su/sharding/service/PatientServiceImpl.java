package com.su.sharding.service;

import com.su.sharding.dao.PatientsMapper;
import com.su.sharding.entry.Patients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService{
    @Autowired
    PatientsMapper patientsMapper;


    @Override
    public int insertOne(Patients patients){
        return patientsMapper.insertSelective(patients);
    }

    @Override
    public Patients selectById(Long id) {
        return patientsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int update(Patients patients) {
        return patientsMapper.updateByPrimaryKeySelective(patients);
    }

    @Override
    public int updateCipher(Patients patients) {

        return patientsMapper.updateCipherByPrimaryKey(patients);
    }

    @Override
    public List<Patients> selectAll() {
        return patientsMapper.selectByKey(new Patients());
    }


}
