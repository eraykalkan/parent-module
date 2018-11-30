package com.eray.childmodule1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChildModule1Application {

	public static void main(String[] args) {

		SpringApplication.run(ChildModule1Application.class, args);
		System.out.println("test");
	}
}
