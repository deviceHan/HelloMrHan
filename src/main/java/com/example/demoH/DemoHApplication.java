package com.example.demoH;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.example.*"})
@MapperScan("com.example.demoH.mapper")
public class DemoHApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoHApplication.class, args);
	}

}
