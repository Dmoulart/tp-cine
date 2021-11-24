package fr.eni.tpcine.services;

import org.springframework.stereotype.Service;

import fr.eni.tpcine.bo.Avis;
import fr.eni.tpcine.repository.EntityRepository;

@Service
public class AvisService extends EntityService<Avis> implements AvisServiceInterface {

	protected AvisService(EntityRepository<Avis> repository) {
		super(repository);
	}

}
