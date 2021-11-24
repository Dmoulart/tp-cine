package fr.eni.tpcine.services;

import java.util.List;
import java.util.Optional;

import fr.eni.tpcine.bo.AppEntity;
import fr.eni.tpcine.bo.Film;

public interface EntityServiceInterface<T extends AppEntity> {
	public List<T> findAll();
	public Optional<T> find(Integer id);
	public void create(T object);
}
