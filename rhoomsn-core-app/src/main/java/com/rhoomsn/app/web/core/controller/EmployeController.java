package com.rhoomsn.app.web.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rhoomsn.app.web.core.service.EmployeService;
import com.rhoomsn.app.web.entity.Employe;


@RestController
@RequestMapping("home")
public class EmployeController {

	@Autowired
	private EmployeService employeService;
	
	@RequestMapping(value = "/employe", method = RequestMethod.GET)
	public @ResponseBody List<Employe> getEmployes() throws Exception {
	    return employeService.getEmployes();
	}
	
	@RequestMapping(value = "/oneEmploye", method = RequestMethod.GET)
	public @ResponseBody Employe getOneEmploye() throws Exception {
	    return employeService.getOneEmploye();
	}
}
