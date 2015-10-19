package com.rhoomsn.app.web.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rhoomsn.app.web.core.service.CongeService;
import com.rhoomsn.app.web.entity.Conge;


@RestController
@RequestMapping("home")
public class CongeController {
	
	@Autowired
	private CongeService congeService;
	
	@RequestMapping(value = "/conge", method = RequestMethod.GET)
	public @ResponseBody List<Conge> getConges() throws Exception {
	    return congeService.getConges();
	}
	
}
