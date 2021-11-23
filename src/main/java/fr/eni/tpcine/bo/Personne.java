package fr.eni.tpcine.bo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.Length;
import org.springframework.lang.Nullable;

@Entity
public class Personne {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Basic
	@Column(unique=false)//true
	private String nom;
	@Basic
	private String prenom;
	
	@Basic
	@Length(min=0,max=15000)
	@Nullable
	private String bio;
	
	public Personne() {
	}

	public Personne(int id, String nom, String prenom, String bio) {
		this.setId(id);
		this.nom = nom;
		this.prenom = prenom;
		this.bio = bio;
	}
	
	

	public Personne(int id, String nom, String prenom) {
		super();
		this.setId(id);
		this.nom = nom;
		this.prenom = prenom;
	}

	public Personne(String nom, String prenom, String bio) {
		this.nom = nom;
		this.prenom = prenom;
		this.bio = bio;
	}
	
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	

}
