package fr.eni.tpcine.repository;

import org.springframework.stereotype.Repository;

import fr.eni.tpcine.bo.AppUser;

@Repository
public interface AppUserRepository extends EntityRepository<AppUser>{

	AppUser findByUsername(String username);
	
	
}
