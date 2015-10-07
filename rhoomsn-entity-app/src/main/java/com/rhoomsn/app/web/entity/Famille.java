package com.rhoomsn.app.web.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the famille database table.
 * 
 */
@Entity
@NamedQuery(name="Famille.findAll", query="SELECT f FROM Famille f")
public class Famille implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name="date_naiss_enfant")
	private Date dateNaissEnfant;

	@Column(name="employes_contrat_code")
	private int employesContratCode;

	@Column(name="employes_fonction_type_fonction")
	private int employesFonctionTypeFonction;
	
	@Id
	@Column(name="employes_id_employe")
	private int employesIdEmploye;

	@Column(name="nom_enfant")
	private String nomEnfant;

	@Column(name="nom_femmme")
	private String nomFemmme;

	@Column(name="prenom_enfant")
	private String prenomEnfant;

	@Column(name="prenom_femmel")
	private String prenomFemmel;

	public Famille() {
	}

	public Date getDateNaissEnfant() {
		return this.dateNaissEnfant;
	}

	public void setDateNaissEnfant(Date dateNaissEnfant) {
		this.dateNaissEnfant = dateNaissEnfant;
	}

	public int getEmployesContratCode() {
		return this.employesContratCode;
	}

	public void setEmployesContratCode(int employesContratCode) {
		this.employesContratCode = employesContratCode;
	}

	public int getEmployesFonctionTypeFonction() {
		return this.employesFonctionTypeFonction;
	}

	public void setEmployesFonctionTypeFonction(int employesFonctionTypeFonction) {
		this.employesFonctionTypeFonction = employesFonctionTypeFonction;
	}

	public int getEmployesIdEmploye() {
		return this.employesIdEmploye;
	}

	public void setEmployesIdEmploye(int employesIdEmploye) {
		this.employesIdEmploye = employesIdEmploye;
	}

	public String getNomEnfant() {
		return this.nomEnfant;
	}

	public void setNomEnfant(String nomEnfant) {
		this.nomEnfant = nomEnfant;
	}

	public String getNomFemmme() {
		return this.nomFemmme;
	}

	public void setNomFemmme(String nomFemmme) {
		this.nomFemmme = nomFemmme;
	}

	public String getPrenomEnfant() {
		return this.prenomEnfant;
	}

	public void setPrenomEnfant(String prenomEnfant) {
		this.prenomEnfant = prenomEnfant;
	}

	public String getPrenomFemmel() {
		return this.prenomFemmel;
	}

	public void setPrenomFemmel(String prenomFemmel) {
		this.prenomFemmel = prenomFemmel;
	}

}