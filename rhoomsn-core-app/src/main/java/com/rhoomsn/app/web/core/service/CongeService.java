package com.rhoomsn.app.web.core.service;

import java.util.Date;
import java.util.List;

import com.rhoomsn.app.web.entity.Conge;


public interface CongeService {
	
	//List<Conge> getConges() throws Exception;
	String create(Date dateDepart, Date dateRetour, int nbrJourDispo, int typecongeTypeConge, int employesContratCode, int employesFonctionTypeFonction, int employesIdEmploye) throws Exception;
	
}
