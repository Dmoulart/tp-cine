package fr.eni.tpcine.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.tpcine.bo.Personne;
import fr.eni.tpcine.repository.EntityRepository;
import fr.eni.tpcine.repository.PersonneRepository;

@Service
public class PersonneService extends EntityService<Personne> implements PersonneServiceInterface{

	protected PersonneService(EntityRepository<Personne> repository) {
		super(repository);
	}

}
