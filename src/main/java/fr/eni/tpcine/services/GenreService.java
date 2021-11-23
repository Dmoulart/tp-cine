package fr.eni.tpcine.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.tpcine.bo.Film;
import fr.eni.tpcine.bo.Genre;
import fr.eni.tpcine.repository.FilmRepository;
import fr.eni.tpcine.repository.GenreRepository;

@Service
public class GenreService implements GenreServiceInterface{
	
	GenreRepository repository;
	
	@Autowired
	public GenreService(GenreRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public List<Genre> findAll() {
		return this.repository.findAll();
	}

	@Override
	public Optional<Genre> find(Integer id) {
		return this.repository.findById(id);	
	}

	@Override
	public void create(Genre genre) {
		this.repository.save(genre);
		this.repository.flush();
	}
	
}
