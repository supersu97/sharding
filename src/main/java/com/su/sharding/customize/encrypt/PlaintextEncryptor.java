package com.su.sharding.customize.encrypt;

import com.gzhc365.web.util.PlainTextEncryptUtil;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.encrypt.strategy.spi.Encryptor;

import java.util.Properties;
@NoArgsConstructor
@Data
@Slf4j
public class PlaintextEncryptor implements Encryptor {

    private Properties properties = new Properties();
    @Override
    public void init() {

    }

    @Override
    public String encrypt(Object plaintext) {
        return PlainTextEncryptUtil.encrypt(String.valueOf(plaintext),"A8duw%ok_Lo24!2f");
    }

    @Override
    public Object decrypt(String ciphertext) {
        return PlainTextEncryptUtil.decrypt(ciphertext,"A8duw%ok_Lo24!2f");
    }

    @Override
    public String getType() {
        return "hcEncrypt";
    }

    @Override
    public void setProperties(Properties properties) {
        if (properties == null) {
            return;
        }
        this.properties = properties;
    }
}
