package com.rhoomsn.app.web.core.mod;

import com.rhoomsn.app.web.entity.Conge;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class CongeMod {
	
	private int typecongeTypeConge;
	private Date dateDepart;
	private Date dateRetour;
	private int employesContratCode;
	private int employesFonctionTypeFonction;
	private int employesIdEmploye;
	private int nbrJourDispo;
	private String libelleContrat;

	public void  Conge() {
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
	
	public void Conge(Date dateDepart, Date dateRetour, int nbrJourDispo, int typecongeTypeConge, int employesContratCode, int employesFonctionTypeFonction, int employesIdEmploye) {
		this.dateDepart = dateDepart;
		this.dateRetour = dateRetour;
		this.nbrJourDispo = nbrJourDispo;
		this.typecongeTypeConge = typecongeTypeConge;
	    this.employesContratCode = employesContratCode;
	    this.employesFonctionTypeFonction = employesFonctionTypeFonction;
	    this.employesIdEmploye = employesIdEmploye;

	}
	
	
}
