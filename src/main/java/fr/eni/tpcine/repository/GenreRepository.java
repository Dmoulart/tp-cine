package fr.eni.tpcine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.eni.tpcine.bo.Film;
import fr.eni.tpcine.bo.Genre;
@Repository
public interface GenreRepository extends EntityRepository<Genre> {

}
