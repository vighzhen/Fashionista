package com.vighzhen.fashionista;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.vighzhen.fashionista.mapper") // 指定 Mapper 接口的扫描路径
public class FashionistaApplication {
    public static void main(String[] args) {
        SpringApplication.run(FashionistaApplication.class, args);
    }

}
