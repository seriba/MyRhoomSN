package com.rhoomsn.app.web.entity;


import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the document database table.
 * 
 */
@Entity
@NamedQuery(name="Document.findAll", query="SELECT d FROM Document d")
public class Document implements Serializable {
	private static final long serialVersionUID = 1L;

	@Lob
	@Column(name="data_fichier")
	private byte[] dataFichier;

	@Column(name="employes_contrat_code")
	private int employesContratCode;

	@Column(name="employes_fonction_type_fonction")
	private int employesFonctionTypeFonction;
	
	@Id
	@Column(name="employes_id_employe")
	private int employesIdEmploye;

	@Column(name="nom_fichier")
	private String nomFichier;

	public Document() {
	}

	public byte[] getDataFichier() {
		return this.dataFichier;
	}

	public void setDataFichier(byte[] dataFichier) {
		this.dataFichier = dataFichier;
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

	public String getNomFichier() {
		return this.nomFichier;
	}

	public void setNomFichier(String nomFichier) {
		this.nomFichier = nomFichier;
	}

}