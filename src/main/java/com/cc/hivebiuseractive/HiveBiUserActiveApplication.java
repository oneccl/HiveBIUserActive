package com.cc.hivebiuseractive;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.cc.hivebiuseractive.dao")
@SpringBootApplication
public class HiveBiUserActiveApplication {

    public static void main(String[] args) {
        SpringApplication.run(HiveBiUserActiveApplication.class, args);
    }

}
