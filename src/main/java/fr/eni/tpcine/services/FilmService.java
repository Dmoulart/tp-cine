package fr.eni.tpcine.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.tpcine.bo.Film;
import fr.eni.tpcine.repository.FilmRepository;

@Service
public class FilmService implements FilmServiceInterface{
	
	FilmRepository repository;
	
	@Autowired
	public FilmService(FilmRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public List<Film> findAll() {
		return this.repository.findAll();
	}

	@Override
	public Optional<Film> find(Integer id) {
		return this.repository.findById(id);	
	}

	@Override
	public void create(Film film) {
		this.repository.save(film);
		this.repository.flush();
	}
	
}
