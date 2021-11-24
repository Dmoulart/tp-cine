package fr.eni.tpcine.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.tpcine.bo.Film;
import fr.eni.tpcine.repository.EntityRepository;
import fr.eni.tpcine.repository.FilmRepository;

@Service
public class FilmService extends EntityService<Film> implements FilmServiceInterface{

	protected FilmService(EntityRepository<Film> repository) {
		super(repository);
	}


}
