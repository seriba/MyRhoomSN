package com.rhoomsn.app.web.core.service;

import java.util.Date;
import java.util.List;

import com.rhoomsn.app.web.entity.Conge;


public interface CongeService {
	
	Conge saveConge(Conge conge) throws Exception;
	
	// Liste Conges
	List<Conge> getConges() throws Exception;
		
	
}
