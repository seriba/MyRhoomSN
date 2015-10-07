package com.rhoomsn.app.web.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the fonction database table.
 * 
 */
@Entity
@NamedQuery(name="Fonction.findAll", query="SELECT f FROM Fonction f")
public class Fonction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="type_fonction")
	private int typeFonction;

	@Column(name="libelle_fonction")
	private String libelleFonction;

	public Fonction() {
	}

	public int getTypeFonction() {
		return this.typeFonction;
	}

	public void setTypeFonction(int typeFonction) {
		this.typeFonction = typeFonction;
	}

	public String getLibelleFonction() {
		return this.libelleFonction;
	}

	public void setLibelleFonction(String libelleFonction) {
		this.libelleFonction = libelleFonction;
	}

}