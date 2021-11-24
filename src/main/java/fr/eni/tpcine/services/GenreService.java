package fr.eni.tpcine.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.tpcine.bo.Film;
import fr.eni.tpcine.bo.Genre;
import fr.eni.tpcine.repository.EntityRepository;
import fr.eni.tpcine.repository.FilmRepository;
import fr.eni.tpcine.repository.GenreRepository;

@Service
public class GenreService extends EntityService<Genre> implements GenreServiceInterface{

	protected GenreService(EntityRepository<Genre> repository) {
		super(repository);
	}
	
}
