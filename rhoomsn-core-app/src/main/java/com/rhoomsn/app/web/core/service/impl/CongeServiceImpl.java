package com.rhoomsn.app.web.core.service.impl;

import java.util.Date;
//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rhoomsn.app.web.entity.Conge;
import com.rhoomsn.app.web.core.dao.CongeDao;
import com.rhoomsn.app.web.core.service.CongeService;

@RequestMapping("/createConge")
@Service
public class CongeServiceImpl implements CongeService {
	
	@Autowired
	private CongeDao congeDao;

	@Override
	public String create(Date dateDepart, Date dateRetour, int nbrJourDispo, int typecongeTypeConge, int employesContratCode, int employesFonctionTypeFonction, int employesIdEmploye) {
		
	
	 Conge conge = null;
	    try {
	    	conge = new Conge(dateDepart, dateRetour, nbrJourDispo, typecongeTypeConge, employesContratCode, employesFonctionTypeFonction, employesIdEmploye);
	        congeDao.save(conge);
	    }
	    catch (Exception ex) {
	      return "Error creating the user: " + ex.toString();
	    }
	    return "User succesfully created! (id = " + conge.getEmployesIdEmploye() + ")";
	  }
	
	

}
