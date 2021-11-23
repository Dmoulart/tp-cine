package fr.eni.tpcine.bo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

@Entity
public class Film {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@NotBlank(message = "Vous devez renseigner un titre � ce flim.")
	@Length(min=0,max=250, message="Le titre doit comporter entre 2 et 25 caract�res.")
	@Basic
	private String titre;
	
	@Range(min=1895, max=2022, message="L'ann�e de sortie du flim doit se trouver entre 1895 et 2022")
	@Basic
	private int annee;
	
	@Length(min=0, max=4000, message="Le synopsis doit comporter entre 15 et 400 caract�res.")
	@Basic
	private String synopsis;
	
	@Range(min=2, max=400, message="La dur�e du film doit �tre entre 2 minutes et 400 minutes.")
	@Basic
	private float duree;
	
	@ManyToMany(cascade= {CascadeType.PERSIST})
	@JoinTable(name="FilmActeurs", joinColumns= {@JoinColumn(name="filmId")}, inverseJoinColumns={@JoinColumn(name="acteurId")})
	private List<Personne> listActeurs;
	
	@NotNull(message="Le film doit avoir un r�alisateur")
	@ManyToOne(cascade=CascadeType.ALL)
	private Personne realisateur;
	
	@NotNull(message="Le film doit avoir un genre")
	@ManyToOne(cascade=CascadeType.ALL)
	private Genre genre;
	
	public Film() {
	}

	public Film(int id, String titre, int annee, float duree, List<Personne> listActeurs, Personne realisateur,
			Genre genre) {
		this.setId(id);
		this.titre = titre;
		this.annee = annee;
		this.duree = duree;
		this.listActeurs = listActeurs;
		this.realisateur = realisateur;
		this.setGenre(genre);
	}
	
	public Film(int id, String titre, int annee, float duree, List<Personne> listActeurs,
			Personne realisateur, Genre genre, String synopsis) {
		super();
		this.setId(id);
		this.titre = titre;
		this.annee = annee;
		this.setSynopsis(synopsis);
		this.duree = duree;
		this.listActeurs = listActeurs;
		this.realisateur = realisateur;
		this.setGenre(genre);
	}

	public Film(String titre, int annee, float duree, List<Personne> listActeurs, Personne realisateur,
			Genre genre) {
		this.titre = titre;
		this.annee = annee;
		this.duree = duree;
		this.listActeurs = listActeurs;
		this.realisateur = realisateur;
		this.setGenre(genre);
	}



	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public float getDuree() {
		return duree;
	}

	public void setDuree(float duree) {
		this.duree = duree;
	}

	public List<Personne> getListActeurs() {
		return listActeurs;
	}

	public void setListActeurs(List<Personne> listActeurs) {
		this.listActeurs = listActeurs;
	}

	public Personne getRealisateur() {
		return realisateur;
	}

	public void setRealisateur(Personne realisateur) {
		this.realisateur = realisateur;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	
	
	
	
	

}
