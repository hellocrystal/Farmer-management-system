package com.njau;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.njau.repo.mapper")
public class GardenApplication {
	public static void main(String[] args) {
		SpringApplication.run(GardenApplication.class, args);
	}
}
