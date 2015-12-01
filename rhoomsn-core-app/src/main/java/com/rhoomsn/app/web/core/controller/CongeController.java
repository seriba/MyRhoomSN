package com.rhoomsn.app.web.core.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rhoomsn.app.web.core.service.CongeService;
import com.rhoomsn.app.web.entity.Conge;
import com.rhoomsn.app.web.entity.Contrat;


@RestController
@RequestMapping("home")
public class CongeController {
	
	@Autowired
	private CongeService congeService;
		
	@RequestMapping(value = "/demandeConge", method = RequestMethod.POST)
	public @ResponseBody Conge saveConge(@RequestBody Conge conge) throws Exception {
		System.out.println("Le conge : " +conge);

		return congeService.saveConge(conge);
	}
	
	@RequestMapping(value = "/notification", method = RequestMethod.GET)
	public @ResponseBody List<Conge> getConges() throws Exception {
	    return congeService.getConges();
	}
	
}
