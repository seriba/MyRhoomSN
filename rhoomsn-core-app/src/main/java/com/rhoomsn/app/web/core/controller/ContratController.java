package com.rhoomsn.app.web.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rhoomsn.app.web.core.service.ContratService;
import com.rhoomsn.app.web.entity.Contrat;


@RestController
@RequestMapping("home")
public class ContratController {
	
	@Autowired
	private ContratService contratService;
	
	@RequestMapping(value = "/contrat", method = RequestMethod.GET)
	public @ResponseBody List<Contrat> getContrats() throws Exception {
	    return contratService.getContrats();
	}
	
	@RequestMapping(value = "/createContrat", method = RequestMethod.POST)
	public @ResponseBody Contrat saveContrat(@RequestBody String libelle) throws Exception {
		Contrat contrat = new Contrat();
		contrat.setLibelleContrat(libelle);
		return contratService.saveContrat(contrat);
	}
	
	
	
}
