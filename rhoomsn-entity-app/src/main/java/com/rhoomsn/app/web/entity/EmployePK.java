package com.rhoomsn.app.web.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the employe database table.
 * 
 */
@Embeddable
public class EmployePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_employe")
	private int idEmploye;

	@Column(name="contrat_code")
	private int contratCode;

	@Column(name="fonction_type_fonction")
	private int fonctionTypeFonction;

	public EmployePK() {
	}
	public int getIdEmploye() {
		return this.idEmploye;
	}
	public void setIdEmploye(int idEmploye) {
		this.idEmploye = idEmploye;
	}
	public int getContratCode() {
		return this.contratCode;
	}
	public void setContratCode(int contratCode) {
		this.contratCode = contratCode;
	}
	public int getFonctionTypeFonction() {
		return this.fonctionTypeFonction;
	}
	public void setFonctionTypeFonction(int fonctionTypeFonction) {
		this.fonctionTypeFonction = fonctionTypeFonction;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof EmployePK)) {
			return false;
		}
		EmployePK castOther = (EmployePK)other;
		return 
			(this.idEmploye == castOther.idEmploye)
			&& (this.contratCode == castOther.contratCode)
			&& (this.fonctionTypeFonction == castOther.fonctionTypeFonction);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idEmploye;
		hash = hash * prime + this.contratCode;
		hash = hash * prime + this.fonctionTypeFonction;
		
		return hash;
	}
}