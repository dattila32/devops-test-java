package com.attila.maven.test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(
		basePackages = {
				"com.attila.maven.test.demo.service",
				"com.attila.maven.test.demo.repository",
				"com.attila.maven.test.demo.controller"
		})
@EnableJpaRepositories(basePackages="com.attila.maven.test.demo.*")
@EntityScan(basePackages="com.attila.maven.test.demo.*")
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
}
