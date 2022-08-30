package com.su.sharding.dao;

import com.su.sharding.entry.Patients;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PatientsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Patients record);

    int insertSelective(Patients record);

    Patients selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Patients record);

    int updateByPrimaryKey(Patients record);

    List<Patients> selectByKey(Patients patients);

    int updateCipherByPrimaryKey(Patients patients);


}