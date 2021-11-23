package fr.eni.tpcine.fixture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.tpcine.bo.Film;
import fr.eni.tpcine.bo.Genre;
import fr.eni.tpcine.bo.Personne;
import fr.eni.tpcine.fixture.SynopsisFilm;
import fr.eni.tpcine.fixture.BioPersonne;

@Service
public class FixtureSansDBB {
	
	private BioPersonne bio;
	private SynopsisFilm resume;
	
	@Autowired
	public FixtureSansDBB(BioPersonne bio, SynopsisFilm resume) {
		this.bio = bio;
		this.resume = resume;
	}
	
	//TODO : refactor the genre declaration in general fixture method using this method 
	public List<Genre> genreFixture(){
		return Arrays.asList(
				new Genre(1,"horreur"),
				new Genre(2,"comédie"),
				new Genre(3,"biopic"),
				new Genre(4,"aventure"),
				new Genre(5,"fantastique"),
				new Genre(6,"sf"),
				new Genre(7,"dramatique")
		);
	}
	
	//TODO : refactor the genre declaration in general fixture method using this method 
	public List<Personne> personneFixture(){
		var bio = this.bio;
		return Arrays.asList(
				new Personne(1,"Damon","Matt",bio.damon),
				 new Personne(2,"Dicaprio","Leo",bio.dicaprio),
				 new Personne(3,"Garell","Louis",bio.garel),
				 new Personne(4,"Cotillard","Marion",bio.cotillard),
				 new Personne(5,"Eva","Green",bio.green),
				 new Personne(6,"Seydoux","Lea",bio.seydoux),
				 new Personne(7,"Pitt","Brad",bio.pitt),
				 new Personne(8,"Perry","Luc",bio.perry)
		);
	}

	public List<Film> fixture() {
		
		ArrayList<Film> listFilms = new ArrayList<Film>();
		
		Genre genre = new Genre("horreur");
		Genre genre1 = new Genre("comédie");
		Genre genre2 = new Genre("biopic");
		Genre genre3 = new Genre("aventure");
		Genre genre4 = new Genre("fantastique");
		Genre genre5 = new Genre("sf");		
		Genre genre6 = new Genre("dramatique");


		Personne acteur = new Personne("Damon","Matt",bio.damon);
		Personne acteur1 = new Personne("Dicaprio","Leo",bio.dicaprio);
		Personne acteur2 = new Personne("Garell","Louis",bio.garel);
		Personne acteur3 = new Personne("Cotillard","Marion",bio.cotillard);
		Personne acteur4 = new Personne("Eva","Green",bio.green);
		Personne acteur5 = new Personne("Seydoux","Lea",bio.seydoux);
		Personne acteur6 = new Personne("Pitt","Brad",bio.pitt);
		Personne acteur7 = new Personne("Perry","Luc",bio.perry);


		Personne realistaeur = new Personne("Nolan","Christopher",bio.nolan);
		Personne realistaeur1 = new Personne("Quentin","Tarantino",bio.tarantino);
		Personne realistaeur2 = new Personne("Bernardo","Bertolucci",bio.bertolucci);
		Personne realistaeur3 = new Personne("Gus","Van Sant",bio.vantSant);
		Personne realistaeur4 = new Personne("Wes","Anderson",bio.anderson);
		
		//Gerry
		ArrayList<Personne> listeActeurs = new ArrayList<Personne>();
		listeActeurs.add(acteur);
		
		//Titanic
		ArrayList<Personne> listeActeurs2 = new ArrayList<Personne>();
		listeActeurs2.add(acteur1);
		
		//The dreamers
		ArrayList<Personne> listeActeurs3 = new ArrayList<Personne>();
		listeActeurs3.add(acteur2);
		listeActeurs3.add(acteur4);
		
		//Inception
		ArrayList<Personne> listeActeurs4 = new ArrayList<Personne>();
		listeActeurs4.add(acteur3);
		listeActeurs4.add(acteur1);
		
		//Once upon a time in Hollywood
		ArrayList<Personne> listeActeurs5 = new ArrayList<Personne>();
		listeActeurs5.add(acteur1);
		listeActeurs5.add(acteur6);
		listeActeurs5.add(acteur7);
		
		//The French Dispatch
		ArrayList<Personne> listeActeurs6 = new ArrayList<Personne>();
		listeActeurs6.add(acteur5);
	
		listFilms.add(new Film(1,"inception",2010,147,listeActeurs4,realistaeur,genre5,resume.getInception())) ;
		listFilms.add(new Film(2,"gerry",2002,103,listeActeurs,realistaeur3,genre6,resume.getGerry())) ;
		listFilms.add(new Film(3,"titanic",1997,195,listeActeurs2,realistaeur,genre6,resume.getGerry()));
		listFilms.add(new Film(4,"the dreamers",2003,116,listeActeurs3,realistaeur,genre3,resume.getDreamers()));
		listFilms.add(new Film(5,"once upon a time in hollywood",2019,161,listeActeurs5,realistaeur,genre5,resume.getOnce())) ;
		listFilms.add(new Film(6,"the french dispatch",2021,103,listeActeurs6,realistaeur,genre5,resume.getFrench()));

		return listFilms;
	}

}
