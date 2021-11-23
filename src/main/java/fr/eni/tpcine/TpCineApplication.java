package fr.eni.tpcine;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fr.eni.tpcine.fixture.FixtureSansDBB;
import fr.eni.tpcine.repository.FilmRepository;
import fr.eni.tpcine.repository.PersonneRepository;
import fr.eni.tpcine.services.FilmService;



@SpringBootApplication
public class TpCineApplication {

	public static void main(String[] args) {
		SpringApplication.run(TpCineApplication.class, args);
	}
	
	@Bean 
	public CommandLineRunner demo(FilmService service, FixtureSansDBB generator) {
		return args -> generator.fixture().forEach(service::create);
	};
}
