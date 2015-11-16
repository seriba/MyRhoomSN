package com.rhoomsn.app.web.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.rhoomsn.app.web.core.service.TypeCongeService;
import com.rhoomsn.app.web.entity.Typeconge;


@RestController
@RequestMapping("home")
public class TypeCongeController {

	@Autowired
	private TypeCongeService typecongeService;
	
	@RequestMapping(value = "/typeconge", method = RequestMethod.GET)
	public @ResponseBody List<Typeconge> gettypeconge() throws Exception {
	    return typecongeService.getTypeConge();
	}
	
}
