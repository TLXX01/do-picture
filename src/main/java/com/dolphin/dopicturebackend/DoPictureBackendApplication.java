package com.dolphin.dopicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@MapperScan("com.dolphin.dopicturebackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class DoPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(DoPictureBackendApplication.class, args);
    }

}
