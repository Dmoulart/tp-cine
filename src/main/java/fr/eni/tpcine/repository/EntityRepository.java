package fr.eni.tpcine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.tpcine.bo.AppEntity;
import fr.eni.tpcine.bo.Film;

public interface EntityRepository<T extends AppEntity> extends JpaRepository<T, Integer>{

}
