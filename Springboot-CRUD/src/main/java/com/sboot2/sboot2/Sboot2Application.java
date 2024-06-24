package com.sboot2.sboot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
 * @ComponentScan(basePackages = {"com.baeldung.annotations.componentscanautoconfigure.healthcare",
  "com.baeldung.annotations.componentscanautoconfigure.employee"},
  basePackageClasses = Teacher.class)
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.sboot2.sboot2"})
@EnableAutoConfiguration
@Configuration
@ComponentScan
public class Sboot2Application {

	public static void main(String[] args) {
		SpringApplication.run(Sboot2Application.class, args);
	}

}
