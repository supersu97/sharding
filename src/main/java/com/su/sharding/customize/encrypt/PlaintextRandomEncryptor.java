package com.su.sharding.customize.encrypt;

import cn.hutool.crypto.digest.HMac;
import cn.hutool.crypto.digest.HmacAlgorithm;
import com.gzhc365.web.util.PlainTextEncryptUtil;
import lombok.Getter;
import lombok.Setter;
import org.apache.shardingsphere.encrypt.strategy.spi.QueryAssistedEncryptor;

import java.time.LocalDateTime;
import java.util.Properties;

@Getter
@Setter
public class PlaintextRandomEncryptor implements QueryAssistedEncryptor {

    private Properties properties = new Properties();
    @Override
    public String queryAssistedEncrypt(String plaintext) {
        return PlainTextEncryptUtil.encrypt(plaintext,"A8duw%ok_Lo24!2f");
    }

    @Override
    public void init() {

    }

    @Override
    public String encrypt(Object plaintext) {
        if (null == plaintext) {
            return null;
        }
        // 原始字符串+变动因子
        byte[] bytes = LocalDateTime.now().toString().getBytes();
        HMac hMac = new HMac(HmacAlgorithm.HmacSHA256, bytes);
        return hMac.digestHex(String.valueOf(plaintext));
    }

    @Override
    public Object decrypt(String ciphertext) {
        return ciphertext;
    }

    @Override
    public String getType() {
        return "hcRandom";
    }

    @Override
    public void setProperties(Properties properties) {
        if (properties == null) {
            return;
        }
        this.properties = properties;
    }
}
