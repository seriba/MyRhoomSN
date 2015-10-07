package com.rhoomsn.app.web.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the connexion database table.
 * 
 */
@Embeddable
public class ConnexionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_connexion")
	private int idConnexion;

	@Column(name="employe_id_employe")
	private int employeIdEmploye;

	@Column(name="employe_contrat_code")
	private int employeContratCode;

	@Column(name="employe_fonction_type_fonction")
	private int employeFonctionTypeFonction;

	public ConnexionPK() {
	}
	public int getIdConnexion() {
		return this.idConnexion;
	}
	public void setIdConnexion(int idConnexion) {
		this.idConnexion = idConnexion;
	}
	public int getEmployeIdEmploye() {
		return this.employeIdEmploye;
	}
	public void setEmployeIdEmploye(int employeIdEmploye) {
		this.employeIdEmploye = employeIdEmploye;
	}
	public int getEmployeContratCode() {
		return this.employeContratCode;
	}
	public void setEmployeContratCode(int employeContratCode) {
		this.employeContratCode = employeContratCode;
	}
	public int getEmployeFonctionTypeFonction() {
		return this.employeFonctionTypeFonction;
	}
	public void setEmployeFonctionTypeFonction(int employeFonctionTypeFonction) {
		this.employeFonctionTypeFonction = employeFonctionTypeFonction;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ConnexionPK)) {
			return false;
		}
		ConnexionPK castOther = (ConnexionPK)other;
		return 
			(this.idConnexion == castOther.idConnexion)
			&& (this.employeIdEmploye == castOther.employeIdEmploye)
			&& (this.employeContratCode == castOther.employeContratCode)
			&& (this.employeFonctionTypeFonction == castOther.employeFonctionTypeFonction);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idConnexion;
		hash = hash * prime + this.employeIdEmploye;
		hash = hash * prime + this.employeContratCode;
		hash = hash * prime + this.employeFonctionTypeFonction;
		
		return hash;
	}
}