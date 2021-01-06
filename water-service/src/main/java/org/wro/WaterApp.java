package org.wro;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class WaterApp {
    public static void main(String... args){
        SpringApplication.run(WaterApp.class, args);
        log.info("Water app..");
    }
}
