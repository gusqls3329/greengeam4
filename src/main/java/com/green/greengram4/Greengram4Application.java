package com.green.greengram4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan //ConfigurationProperties 가 있는곳을 Scan하겠다
@SpringBootApplication
public class Greengram4Application {

    public static void main(String[] args) {
        SpringApplication.run(Greengram4Application.class, args);
    }

}
