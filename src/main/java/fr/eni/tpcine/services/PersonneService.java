package fr.eni.tpcine.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.tpcine.bo.Personne;
import fr.eni.tpcine.repository.PersonneRepository;

@Service
public class PersonneService implements PersonneServiceInterface{
	
	PersonneRepository repository;
	
	@Autowired
	public PersonneService(PersonneRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public List<Personne> findAll() {
		return repository.findAll();
	}

	@Override
	public Optional<Personne> find(Integer id) {
		return this.find(id);
	}

	@Override
	public void create(Personne object) {
		this.repository.save(object);
		this.repository.flush();
	}

}
