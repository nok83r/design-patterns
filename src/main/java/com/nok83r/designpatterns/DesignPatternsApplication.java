package com.nok83r.designpatterns;

import com.nok83r.designpatterns.creational.factoryMethod.FactoryMethodMain;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		FactoryMethodMain.run();
	}
}
