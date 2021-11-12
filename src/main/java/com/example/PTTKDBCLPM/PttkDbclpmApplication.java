package com.example.PTTKDBCLPM;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableAutoConfiguration
public class PttkDbclpmApplication {

	public static void main(String[] args) {
		SpringApplication.run(PttkDbclpmApplication.class, args);
	}

}
