package com.rhoomsn.app.web.core.mod;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.rhoomsn.app.web.entity.Employe;
import com.rhoomsn.app.web.entity.EmployePK;

public class EmployeMod {
	
	private EmployePK id;
	private String adresseEmploye;
	private String coordonneBanque;
	private Date dateArriveeEmploye;
	private Date dateNaissanceEmploye;
	private int droitConnexion;
	private int employeActif;
	private String mailEmploye;
	private int managerId;
	private String nomEmploye;
	private String prenomEmploye;
	private String role;
	private String telEmploye;
	//private EmployePK id;
	
	public void Employe() {
	}

	public EmployePK getId() {
		return this.id;
	}

	public void setId(EmployePK id) {
		this.id = id;
	}

	public String getAdresseEmploye() {
		return this.adresseEmploye;
	}

	public void setAdresseEmploye(String adresseEmploye) {
		this.adresseEmploye = adresseEmploye;
	}

	public String getCoordonneBanque() {
		return this.coordonneBanque;
	}

	public void setCoordonneBanque(String coordonneBanque) {
		this.coordonneBanque = coordonneBanque;
	}

	public Date getDateArriveeEmploye() {
		return this.dateArriveeEmploye;
	}

	public void setDateArriveeEmploye(Date dateArriveeEmploye) {
		this.dateArriveeEmploye = dateArriveeEmploye;
	}

	public Date getDateNaissanceEmploye() {
		return this.dateNaissanceEmploye;
	}

	public void setDateNaissanceEmploye(Date dateNaissanceEmploye) {
		this.dateNaissanceEmploye = dateNaissanceEmploye;
	}

	public int getDroitConnexion() {
		return this.droitConnexion;
	}

	public void setDroitConnexion(int droitConnexion) {
		this.droitConnexion = droitConnexion;
	}

	public int getEmployeActif() {
		return this.employeActif;
	}

	public void setEmployeActif(int employeActif) {
		this.employeActif = employeActif;
	}

	public String getMailEmploye() {
		return this.mailEmploye;
	}

	public void setMailEmploye(String mailEmploye) {
		this.mailEmploye = mailEmploye;
	}

	public int getManagerId() {
		return this.managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getNomEmploye() {
		return this.nomEmploye;
	}

	public void setNomEmploye(String nomEmploye) {
		this.nomEmploye = nomEmploye;
	}

	public String getPrenomEmploye() {
		return this.prenomEmploye;
	}

	public void setPrenomEmploye(String prenomEmploye) {
		this.prenomEmploye = prenomEmploye;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getTelEmploye() {
		return this.telEmploye;
	}

	public void setTelEmploye(String telEmploye) {
		this.telEmploye = telEmploye;
	}
	
	
	
	
}
