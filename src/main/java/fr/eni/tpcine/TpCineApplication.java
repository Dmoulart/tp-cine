package fr.eni.tpcine;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fr.eni.tpcine.bo.Film;
import fr.eni.tpcine.fixture.FixtureSansDBB;
import fr.eni.tpcine.repository.FilmRepository;
import fr.eni.tpcine.repository.PersonneRepository;
import fr.eni.tpcine.services.FilmService;
import fr.eni.tpcine.services.GenreService;
import fr.eni.tpcine.services.PersonneService;



@SpringBootApplication
public class TpCineApplication {

	public static void main(String[] args) {
		SpringApplication.run(TpCineApplication.class, args);
	}
	
	@Bean 
	public CommandLineRunner demo(FilmService filmService, GenreService genreService, PersonneService personneService,  FixtureSansDBB generator) {
		return args ->{ 
			// generator.genreFixture().forEach(genreService::create);
			// generator.personneFixture().forEach(personneService::create);
			
			// generator.fixture().forEach(filmService::create);		
		};
	};
}
