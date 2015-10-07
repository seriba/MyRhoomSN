package com.rhoomsn.app.web.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the connexion database table.
 * 
 */
@Entity
@NamedQuery(name="Connexion.findAll", query="SELECT c FROM Connexion c")
public class Connexion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ConnexionPK id;

	private String login;

	private String password;

	public Connexion() {
	}

	public ConnexionPK getId() {
		return this.id;
	}

	public void setId(ConnexionPK id) {
		this.id = id;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}