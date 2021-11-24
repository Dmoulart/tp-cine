package fr.eni.tpcine.bo;

import java.sql.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Avis extends AppEntity {
	
	@Basic
	int note;
	
	@Basic
	Date date;
	
	@Basic
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


	

}
