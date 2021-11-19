package fr.eni.tpcine.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.tpcine.bo.Film;
import fr.eni.tpcine.fixture.BioPersonne;
import fr.eni.tpcine.fixture.FixtureSansDBB;
import fr.eni.tpcine.fixture.SynopsisFilm;

@Service
public class FilmService implements FilmServiceInterface {
	
	private static List<Film> films;
	
	private FixtureSansDBB generator;
	
	public FilmService(FixtureSansDBB generator) {
		this.generator = generator;
		FilmService.films = this.generator.fixture();
	}
	

	@Override
	public List<Film> getAll() {
		return FilmService.films;
	}


	@Override
	public Film get(int id) {
		return FilmService.films.stream()
				  .filter(f-> id  == f.getId())
				  .findAny()
				  .orElse(null);	
	}

}
