package fr.eni.tpcine.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import fr.eni.tpcine.bo.AppEntity;
import fr.eni.tpcine.repository.EntityRepository;
import fr.eni.tpcine.repository.FilmRepository;

public abstract class EntityService<T extends AppEntity> implements EntityServiceInterface<T> {
	
	EntityRepository<T> repository;
	
	@Autowired
	protected EntityService(EntityRepository<T> repository) {
		this.repository = repository;
	}
	
	@Override
	public List<T> findAll() {
		return this.repository.findAll();
	}

	@Override
	public Optional<T> find(Integer id) {
		return this.repository.findById(id);	
	}

	@Override
	public void create(T object) {
		this.repository.save(object);
		this.repository.flush();
		
	}
	
}
