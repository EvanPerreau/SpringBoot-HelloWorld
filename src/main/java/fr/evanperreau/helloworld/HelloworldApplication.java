package fr.evanperreau.helloworld;

import fr.evanperreau.helloworld.model.HelloWorld;
import fr.evanperreau.helloworld.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworldApplication implements CommandLineRunner {

	@Autowired
	private BusinessService bs;

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}

	@Override
	public void run(String[] args) throws Exception {
		HelloWorld hw = bs.getHelloWorld();

		System.out.println(hw);
	}
}
