package com.rainyalley.architecture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author bin.zhang
 */
@SpringBootApplication(
	scanBasePackages = {
		"com.rainyalley.architecture.graphql",
		"com.rainyalley.architecture.config",
		"com.rainyalley.architecture.controller",
		"com.rainyalley.architecture.aop",
		"com.rainyalley.architecture.impl"},
	exclude = {DataSourceAutoConfiguration.class})
public class WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}
}

