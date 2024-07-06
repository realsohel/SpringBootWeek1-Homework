package com.sohel.week1Homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Alice and her Bakery
@SpringBootApplication
public class Week1HomeworkApplication implements CommandLineRunner {


	@Autowired
	CakeBaker cake;
	public static void main(String[] args) {

		SpringApplication.run(Week1HomeworkApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		cake.bakeCake();
	}

}
