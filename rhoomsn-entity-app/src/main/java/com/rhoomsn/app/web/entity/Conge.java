package com.rhoomsn.app.web.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the conge database table.
 * 
 */
@Entity
@NamedQuery(name="Conge.findAll", query="SELECT c FROM Conge c")
public class Conge implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="typeconge_type_conge")
	private int typecongeTypeConge;

	@Temporal(TemporalType.DATE)
	@Column(name="date_depart")
	private Date dateDepart;

	@Temporal(TemporalType.DATE)
	@Column(name="date_retour")
	private Date dateRetour;

	@Column(name="employes_contrat_code")
	private int employesContratCode;

	@Column(name="employes_fonction_type_fonction")
	private int employesFonctionTypeFonction;

	@Column(name="employes_id_employe")
	private int employesIdEmploye;

	@Column(name="nbr_jour_dispo")
	private int nbrJourDispo;

	public Conge() {
	}

	public int getTypecongeTypeConge() {
		return this.typecongeTypeConge;
	}

	public void setTypecongeTypeConge(int typecongeTypeConge) {
		this.typecongeTypeConge = typecongeTypeConge;
	}

	public Date getDateDepart() {
		return this.dateDepart;
	}

	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}

	public Date getDateRetour() {
		return this.dateRetour;
	}

	public void setDateRetour(Date dateRetour) {
		this.dateRetour = dateRetour;
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

	public int getNbrJourDispo() {
		return this.nbrJourDispo;
	}

	public void setNbrJourDispo(int nbrJourDispo) {
		this.nbrJourDispo = nbrJourDispo;
	}

}