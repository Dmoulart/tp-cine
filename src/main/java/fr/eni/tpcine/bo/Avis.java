package fr.eni.tpcine.bo;

import java.sql.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Range;

@Entity
public class Avis extends AppEntity {
	@Basic
	@Range(min=0,max=5, message="Votre note doit être entre 0 et 5")
	int note;
	
	@Basic
	Date date;
	
	@Basic
	@NotEmpty(message="Vous devez saisir commentaire.")
	String comment;
	
	@ManyToOne(cascade= {CascadeType.PERSIST,CascadeType.MERGE})
	AppUser user;
	
	@ManyToOne(cascade= {CascadeType.PERSIST,CascadeType.MERGE})
	Film film;
	
	public Avis() {}

	public Avis(int note, Date date, String comment) {
		super();
		this.note = note;
		this.date = date;
		this.comment = comment;
	}
	
	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public AppUser getUser() {
		return user;
	}

	public void setUser(AppUser user) {
		this.user = user;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}
	
	
	/*@Override
	public String toString() {
		return "Avis [note=" + note + ", date=" + date + ", comment=" + comment + ", user=" + user + ", film=" + film
				+ "]";
	}*/
}
