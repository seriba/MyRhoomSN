package com.rhoomsn.app.web.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the contrat database table.
 * 
 */
@Entity
@NamedQuery(name="Contrat.findAll", query="SELECT c FROM Contrat c")
public class Contrat implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int code;

	@Column(name="libelle_contrat")
	private String libelleContrat;

	public Contrat() {
	}

	public Contrat(int code, String libelleContrat) {
		this.code = code;
		this.libelleContrat = libelleContrat;
	}

	public int getCode() {
		return this.code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getLibelleContrat() {
		return this.libelleContrat;
	}

	public void setLibelleContrat(String libelleContrat) {
		this.libelleContrat = libelleContrat;
	}

}