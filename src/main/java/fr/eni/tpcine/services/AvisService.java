package fr.eni.tpcine.services;

import fr.eni.tpcine.bo.Avis;
import fr.eni.tpcine.repository.EntityRepository;

public class AvisService extends EntityService<Avis> implements AvisServiceInterface {

	protected AvisService(EntityRepository<Avis> repository) {
		super(repository);
	}

}
