package com.su.sharding.entry;

import java.util.Date;

/**
    * 就诊人表
    */
public class Patients {
    /**
    * id号
    */
    private Long id;

    /**
    * 就诊人姓名
    */
    private String name;

    private String nameCipher;

    /**
    * 医院id
    */
    private Long hisId;

    /**
    * 医院名称
    */
    private String hisName;

    /**
    * 所属用户id
    */
    private Long userId;

    /**
    * 就诊卡功能类型;3位二进制数字,每位数字分别代表体检卡,住院卡,门诊卡;  例：001-只是门诊卡, 011-既是住院卡又是门诊卡, 111-表示体检卡,住院卡,门诊卡三卡合一
    */
    private String channelType;

    /**
    * 就诊人类型【0-默认，1-儿童，2-妇女，3-老人】
    */
    private Integer patientType;

    /**
    * 与本人关系id
    */
    private Integer relationType;

    /**
    * 证件类型（1-身份证 2-港澳居民身份证 3-台湾居民身份证 4-护照）
    */
    private Integer idType;

    /**
    * 就诊人证件号
    */
    private String idNo;

    private String idNoCipher;

    /**
    * 性别（F-女 M-男）
    */
    private String sex;

    /**
    * 出生日期
    */
    private Date birthday;

    /**
    * 电话号码
    */
    private String mobile;

    private String mobileCipher;

    /**
    * 住址
    */
    private String address;

    /**
    * 就诊人详细住址
    */
    private String addressCipher;

    /**
    * 是否绑卡（0-否 1-是）
    */
    private Integer bindStatus;

    /**
    * 监护人姓名
    */
    private String parentName;

    private String parentNameCipher;

    /**
    * 监护人证件类型（1-身份证 2-港澳居民身份证 3-台湾居民身份证 4-护照）
    */
    private Integer parentIdType;

    /**
    * 监护人证件号
    */
    private String parentIdNo;

    private String parentIdNoCipher;

    /**
    * 医院卡号类型(11：二代身份证;12：港澳居民身份证;13：台湾居民身份证;14：护照;21：院内诊疗卡;22：社保卡;23：医保卡;24：区域健康卡;)
    */
    private Integer patCardType;

    /**
    * 医院卡号id
    */
    private String patCardNo;

    /**
    * 消费类型（自费/医保）
    */
    private String consumeType;

    /**
    * 标志（1-默认就诊人）
    */
    private Integer isDefalut;

    private Integer isSelf;

    /**
    * 同步状态（0-未同步 1-已同步）
    */
    private Integer syncStatus;

    private Integer type;

    /**
    * 身份验证图片
    */
    private String idImage;

    /**
    * his住院id
    */
    private String patInNo;

    /**
    * 0 未绑定医保卡 1 已绑定医保卡
    */
    private Integer bindMedicareCard;

    /**
    * 身高
    */
    private Integer height;

    /**
    * 体重
    */
    private Integer weight;

    /**
    * 婚否 0 未婚 1 已婚
    */
    private Integer married;

    /**
    * 吸烟史 吸烟的年数 0为不吸烟
    */
    private Integer smoking;

    /**
    * his门诊中患者id
    */
    private String patHisNo;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 最后修改时间
    */
    private Date updateTime;

    /**
    * 账号id
    */
    private Long accountId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameCipher() {
        return nameCipher;
    }

    public void setNameCipher(String nameCipher) {
        this.nameCipher = nameCipher;
    }

    public Long getHisId() {
        return hisId;
    }

    public void setHisId(Long hisId) {
        this.hisId = hisId;
    }

    public String getHisName() {
        return hisName;
    }

    public void setHisName(String hisName) {
        this.hisName = hisName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public Integer getPatientType() {
        return patientType;
    }

    public void setPatientType(Integer patientType) {
        this.patientType = patientType;
    }

    public Integer getRelationType() {
        return relationType;
    }

    public void setRelationType(Integer relationType) {
        this.relationType = relationType;
    }

    public Integer getIdType() {
        return idType;
    }

    public void setIdType(Integer idType) {
        this.idType = idType;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getIdNoCipher() {
        return idNoCipher;
    }

    public void setIdNoCipher(String idNoCipher) {
        this.idNoCipher = idNoCipher;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobileCipher() {
        return mobileCipher;
    }

    public void setMobileCipher(String mobileCipher) {
        this.mobileCipher = mobileCipher;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressCipher() {
        return addressCipher;
    }

    public void setAddressCipher(String addressCipher) {
        this.addressCipher = addressCipher;
    }

    public Integer getBindStatus() {
        return bindStatus;
    }

    public void setBindStatus(Integer bindStatus) {
        this.bindStatus = bindStatus;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getParentNameCipher() {
        return parentNameCipher;
    }

    public void setParentNameCipher(String parentNameCipher) {
        this.parentNameCipher = parentNameCipher;
    }

    public Integer getParentIdType() {
        return parentIdType;
    }

    public void setParentIdType(Integer parentIdType) {
        this.parentIdType = parentIdType;
    }

    public String getParentIdNo() {
        return parentIdNo;
    }

    public void setParentIdNo(String parentIdNo) {
        this.parentIdNo = parentIdNo;
    }

    public String getParentIdNoCipher() {
        return parentIdNoCipher;
    }

    public void setParentIdNoCipher(String parentIdNoCipher) {
        this.parentIdNoCipher = parentIdNoCipher;
    }

    public Integer getPatCardType() {
        return patCardType;
    }

    public void setPatCardType(Integer patCardType) {
        this.patCardType = patCardType;
    }

    public String getPatCardNo() {
        return patCardNo;
    }

    public void setPatCardNo(String patCardNo) {
        this.patCardNo = patCardNo;
    }

    public String getConsumeType() {
        return consumeType;
    }

    public void setConsumeType(String consumeType) {
        this.consumeType = consumeType;
    }

    public Integer getIsDefalut() {
        return isDefalut;
    }

    public void setIsDefalut(Integer isDefalut) {
        this.isDefalut = isDefalut;
    }

    public Integer getIsSelf() {
        return isSelf;
    }

    public void setIsSelf(Integer isSelf) {
        this.isSelf = isSelf;
    }

    public Integer getSyncStatus() {
        return syncStatus;
    }

    public void setSyncStatus(Integer syncStatus) {
        this.syncStatus = syncStatus;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getIdImage() {
        return idImage;
    }

    public void setIdImage(String idImage) {
        this.idImage = idImage;
    }

    public String getPatInNo() {
        return patInNo;
    }

    public void setPatInNo(String patInNo) {
        this.patInNo = patInNo;
    }

    public Integer getBindMedicareCard() {
        return bindMedicareCard;
    }

    public void setBindMedicareCard(Integer bindMedicareCard) {
        this.bindMedicareCard = bindMedicareCard;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getMarried() {
        return married;
    }

    public void setMarried(Integer married) {
        this.married = married;
    }

    public Integer getSmoking() {
        return smoking;
    }

    public void setSmoking(Integer smoking) {
        this.smoking = smoking;
    }

    public String getPatHisNo() {
        return patHisNo;
    }

    public void setPatHisNo(String patHisNo) {
        this.patHisNo = patHisNo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }
}