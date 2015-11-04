package com.rhoomsn.app.web.core.service;

import java.util.List;

import com.rhoomsn.app.web.entity.Contrat;


public interface ContratService {
	
	List<Contrat> getContrats() throws Exception;
	
	Contrat saveContrat(int code, String libelle) throws Exception;
	
}
