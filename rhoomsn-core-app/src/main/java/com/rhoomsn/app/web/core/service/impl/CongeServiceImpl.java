package com.rhoomsn.app.web.core.service.impl;

import java.util.Date;
//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rhoomsn.app.web.entity.Conge;
import com.rhoomsn.app.web.core.dao.CongeDao;
import com.rhoomsn.app.web.core.service.CongeService;

@RequestMapping("/createConge")
@Service
public class CongeServiceImpl implements CongeService {
	
	@Autowired
	private CongeDao congeDao;

	@Override
	public Conge saveConge(Conge congeCreat) {
		
	
	 Conge conge = null;
	
	    	conge = new Conge();
	    	conge.setDateDepart(congeCreat.getDateDepart());
	    	conge.setDateRetour(congeCreat.getDateRetour());
	    	
	    	int diffInDays = (int)((congeCreat.getDateRetour().getTime() - congeCreat.getDateDepart().getTime()) 
	                 / (1000 * 60 * 60 * 24) );
	    		
	    	conge.setNbrJourDispo(diffInDays); // C'est calculer dans le controleur
	    	conge.setTypecongeTypeConge(congeCreat.getTypecongeTypeConge());
	    	
	   // Le reste des champs à recuperer apres l'authentification
	       conge.setEmployesIdEmploye(1);
	       conge.setEmployesFonctionTypeFonction(1);
	       conge.setEmployesContratCode(1);
	    	
	        return congeDao.saveAndFlush(conge);
	   

	  }
	
	

}
