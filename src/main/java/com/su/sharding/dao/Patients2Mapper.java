package com.su.sharding.dao;

import com.su.sharding.entry.Patients;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author subo
 */
@Mapper
public interface Patients2Mapper {
    int deleteByPrimaryKey(Long id);

    int insert(Patients record);

    int insertSelective(Patients record);

    int batchInsert(@Param("list") List<Patients> list);

    Patients selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Patients record);

    int updateByPrimaryKey(Patients record);

    List<Patients> selectByKey(Patients patients);

    int updateCipherByPrimaryKey(Patients patients);


}