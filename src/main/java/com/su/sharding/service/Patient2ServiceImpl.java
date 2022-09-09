package com.su.sharding.service;

import com.su.sharding.dao.Patients2Mapper;
import com.su.sharding.entry.Patients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Patient2ServiceImpl implements PatientService{
    @Autowired
    Patients2Mapper patientsMapper;


    @Override
    public int insertOne(Patients patients){
        return patientsMapper.insertSelective(patients);
    }

    @Override
    public int batchInsert(List<Patients> list) {
        return patientsMapper.batchInsert(list);
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

    public List<Patients> selectByKey(Patients patients){
        return patientsMapper.selectByKey(patients);
    }


}
