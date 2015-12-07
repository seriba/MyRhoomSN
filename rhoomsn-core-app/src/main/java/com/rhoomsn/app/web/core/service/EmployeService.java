package com.rhoomsn.app.web.core.service;

import java.util.List;

import com.rhoomsn.app.web.entity.Employe;


public interface EmployeService {
	
	List<Employe> getEmployes() throws Exception;
	
	Employe getOneEmploye() throws Exception;
	
}
