package com.dgc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlankApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(BlankApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
}
