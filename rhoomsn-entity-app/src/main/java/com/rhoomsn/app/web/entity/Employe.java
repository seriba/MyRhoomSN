package com.rhoomsn.app.web.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the employe database table.
 * 
 */
@Entity
@NamedQuery(name="Employe.findAll", query="SELECT e FROM Employe e")
public class Employe implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private EmployePK id;

	@Column(name="adresse_employe")
	private String adresseEmploye;

	@Column(name="coordonne_banque")
	private String coordonneBanque;

	@Temporal(TemporalType.DATE)
	@Column(name="date_arrivee_employe")
	private Date dateArriveeEmploye;

	@Temporal(TemporalType.DATE)
	@Column(name="date_naissance_employe")
	private Date dateNaissanceEmploye;

	@Column(name="droit_connexion")
	private int droitConnexion;

	@Column(name="employe_actif")
	private int employeActif;

	@Column(name="mail_employe")
	private String mailEmploye;

	@Column(name="manager_id")
	private int managerId;

	@Column(name="nom_employe")
	private String nomEmploye;

	@Column(name="prenom_employe")
	private String prenomEmploye;

	private String role;

	@Column(name="tel_employe")
	private String telEmploye;

	public Employe() {
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