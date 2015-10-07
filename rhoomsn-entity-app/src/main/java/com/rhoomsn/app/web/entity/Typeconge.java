package com.rhoomsn.app.web.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the typeconge database table.
 * 
 */
@Entity
@NamedQuery(name="Typeconge.findAll", query="SELECT t FROM Typeconge t")
public class Typeconge implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="type_conge")
	private int typeConge;

	@Column(name="libelle_conge")
	private String libelleConge;

	public Typeconge() {
	}

	public int getTypeConge() {
		return this.typeConge;
	}

	public void setTypeConge(int typeConge) {
		this.typeConge = typeConge;
	}

	public String getLibelleConge() {
		return this.libelleConge;
	}

	public void setLibelleConge(String libelleConge) {
		this.libelleConge = libelleConge;
	}

}