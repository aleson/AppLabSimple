package com.applabsimple.AppLabSimple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Current status:
 * Application put into containers:
 * db - container with PostgreSQL
 * adminer - manage database in web
 * simple-app - container with application (in progress)
 */

@SpringBootApplication
public class AppLabSimpleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppLabSimpleApplication.class, args);
	}

}

