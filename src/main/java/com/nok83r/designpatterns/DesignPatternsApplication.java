package com.nok83r.designpatterns;

import com.nok83r.designpatterns.creational.abstractFactory.AbstractFactoryMain;
import com.nok83r.designpatterns.creational.factoryMethod.FactoryMethodMain;
import com.nok83r.designpatterns.creational.factoryMethod.TaxFactory;
import com.nok83r.designpatterns.creational.singleton.SingletonMain;
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
		System.out.println("FACTORY METHOD");
		FactoryMethodMain.run(TaxFactory.Taxes.DEFAULT);

		System.out.println("ABSTRACT FACTORY");
		AbstractFactoryMain.run(AbstractFactoryMain.OS.LINUX);

		System.out.println("SINGLETON");
		SingletonMain.run();

		System.exit(1);

	}
}
