package com.su.sharding;

import com.alibaba.fastjson.JSONObject;
import com.gzhc365.web.util.PlainTextEncryptUtil;
import com.su.sharding.entry.Patients;
import com.su.sharding.service.Patient2ServiceImpl;
import com.su.sharding.service.PatientServiceImpl;
import com.su.sharding.utils.AESUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@SpringBootTest
class ShardingApplicationTests {
    @Autowired
    PatientServiceImpl patientService;
    @Autowired
    Patient2ServiceImpl patient2Service;

    @Test
    void contextLoads() {
    }

    @Test
    @DisplayName("单条插入")
    void insert(){
        Patients patients = new Patients();
        patients.setId(1002000040700018L);
        patients.setName("测试1");
        patients.setIdNo("123465798897");
        patients.setMobile("18987365498217");
        patients.setHisId(2408L);
        patients.setUserId(12346L);
        patientService.insertOne(patients);
    }

    @Test
    @DisplayName("批量插入")
    void insertList(){

        Patients patients1 = new Patients();
        patients1.setId(1002000040700019L);
        patients1.setName("测试2");
        patients1.setIdNo("4597813165498798451");
        patients1.setMobile("18987318117");
        patients1.setHisId(2408L);
        patients1.setUserId(12346L);

        Patients patients2 = new Patients();
        patients2.setId(1002000040700020L);
        patients2.setName("测试3");
        patients2.setIdNo("459781316549182354");
        patients2.setMobile("100000007");
        patients2.setHisId(2408L);
        patients2.setUserId(12346L);

        List<Patients> list = new ArrayList<>();
        list.add(patients1);
        list.add(patients2);
        int i = patientService.batchInsert(list);

    }


    @Test
    @DisplayName("根据id查询患者")
    void select(){
        Patients patients = patientService.selectById(1002000040700018L);
        System.out.println(JSONObject.toJSONString(patients));
    }

    @Test
    @DisplayName("条件查询患者")
    void selectByKey(){
        Patients patients = new Patients();
        patients.setMobile("18987365498217");
        System.out.println(JSONObject.toJSONString(patientService.selectByKey(patients)));
    }

    @Test
    @DisplayName("查询所有")
    void selectAll() {
        System.out.println(JSONObject.toJSONString(patient2Service.selectAll()));
        System.out.println(JSONObject.toJSONString(patient2Service.selectAll()));
    }

    @Test
    @DisplayName("旧数据清理")
    void updateCipher() throws Exception{
        List<Patients> patients = patientService.selectAll();
        String aesKey = "A8duw%ok_Lo24!2f";
        patients.forEach(patient -> {
            try {
                String nameCipher = Objects.requireNonNull(PlainTextEncryptUtil.encrypt(patient.getName(), aesKey)).toString();
                String idNoCipher = Objects.requireNonNull(PlainTextEncryptUtil.encrypt(patient.getIdNo(), aesKey)).toString();
                String mobileCipher = Objects.requireNonNull(PlainTextEncryptUtil.encrypt(patient.getMobile(), aesKey)).toString();

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
    @DisplayName("修改")
    public void update(){
        Patients patients = new Patients();
        patients.setId(1002000040700018L);
        patients.setName("测试测试2");
        patients.setMobile("18684975132");
        patientService.update(patients);
    }
}
