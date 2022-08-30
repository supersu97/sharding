package com.su.sharding;

import com.alibaba.fastjson.JSONObject;
import com.su.sharding.entry.Patients;
import com.su.sharding.service.PatientServiceImpl;
import com.su.sharding.utils.AESUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Objects;

@SpringBootTest
class ShardingApplicationTests {
    @Autowired
    PatientServiceImpl patientService;

    @Test
    void contextLoads() {
    }

    @Test
    void insert(){
        Patients patients = new Patients();
        patients.setId(1221213L);
        patients.setName("测试3");
        patients.setIdNo("123465798897");
        patients.setMobile("18987365498217");
        patients.setHisId(2148L);
        patients.setUserId(12346L);
        patientService.insertOne(patients);
    }


    @Test
    void select(){
        Patients patients = patientService.selectById(1221214L);
        System.out.println(JSONObject.toJSONString(patients));
    }

    @Test
    void selectAll() {
        System.out.println(JSONObject.toJSONString(patientService.selectAll()));
    }

    @Test
    void updateCipher() throws Exception{
        List<Patients> patients = patientService.selectAll();
        String aesKey = "123456abc";
        patients.forEach(patient -> {
            try {
                String nameCipher = Objects.requireNonNull(AESUtils.encrypt(patient.getName(), aesKey)).toString();
                String idNoCipher = Objects.requireNonNull(AESUtils.encrypt(patient.getIdNo(), aesKey)).toString();
                String mobileCipher = Objects.requireNonNull(AESUtils.encrypt(patient.getMobile(), aesKey)).toString();

                patient.setNameCipher(nameCipher);
                patient.setIdNoCipher(idNoCipher);
                patient.setMobileCipher(mobileCipher);
                patientService.updateCipher(patient);

            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    @Test
    public void update(){
        Patients patients = new Patients();
        patients.setId(1221212L);
        patients.setName("测试测试2");
        patientService.update(patients);
    }

}
