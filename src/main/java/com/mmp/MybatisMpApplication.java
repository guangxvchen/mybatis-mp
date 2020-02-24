package com.mmp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author think
 */
@SpringBootApplication
//@MapperScan("com.mmp.mp.url.mapper")
public class MybatisMpApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisMpApplication.class, args);
    }

}
