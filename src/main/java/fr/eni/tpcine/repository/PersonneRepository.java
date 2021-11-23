package fr.eni.tpcine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.eni.tpcine.bo.Film;
import fr.eni.tpcine.bo.Genre;
import fr.eni.tpcine.bo.Personne;
@Repository
public interface PersonneRepository extends JpaRepository<Personne, Integer> {

}
