package fr.eni.tpcine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.eni.tpcine.bo.AppUser;
import fr.eni.tpcine.bo.Film;
@Repository
public interface FilmRepository extends EntityRepository<Film> {

}
