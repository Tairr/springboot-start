package com.videonet;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.videonet.dao")
@ComponentScan
@EnableAutoConfiguration
public class VideonetApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideonetApplication.class, args);
	}
}
