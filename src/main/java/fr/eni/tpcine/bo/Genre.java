package fr.eni.tpcine.bo;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Genre extends AppEntity {
	
	@Basic
	private String libelle;

	public Genre() {
	}

	public Genre(int id, String libelle) {
		super();
		this.setId(id);
		this.libelle = libelle;
	}


	public Genre(String libelle) {
		this.libelle = libelle;
	}


	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	@Override
	public String toString() {
		return "Genre [libelle=" + libelle + "]";
	}

}
