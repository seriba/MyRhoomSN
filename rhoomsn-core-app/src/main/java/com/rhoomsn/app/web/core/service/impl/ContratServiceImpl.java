package com.rhoomsn.app.web.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rhoomsn.app.web.entity.Contrat;
import com.rhoomsn.app.web.core.dao.ContratDao;
import com.rhoomsn.app.web.core.service.ContratService;

@Service
public class ContratServiceImpl implements ContratService {
	
	@Autowired
	private ContratDao contratDao;

	@Override
	public List<Contrat> getContrats() throws Exception {
		
		List<Contrat> contratList = contratDao.findAll(); 
		return contratList;
	}
	
	public Contrat saveContrat(Contrat contrat) throws Exception {
		
	//	Contrat contrat = new Contrat();
	//	contrat.setLibelleContrat(libelle);	
	//	System.out.println("Insertion dans Serv Impl: "+libelle);
		return this.contratDao.saveAndFlush(contrat);
	}
	

}
