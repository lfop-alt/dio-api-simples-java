package com.dio.RDS;

import com.dio.RDS.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RdsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RdsApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(PersonRepository repository){
		return args -> {
			repository.save(new Person("João", "Silva"));
			repository.save(new Person("Luiz", "Pedro"));
		};
	}

}
