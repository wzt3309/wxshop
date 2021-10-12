package io.zeddw.wxshop.facade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xingguan.wzt
 * @date 2021/10/12
 */
@SpringBootApplication(scanBasePackages = "io.zeddw.wxshop.facade")
public class TestApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
}
