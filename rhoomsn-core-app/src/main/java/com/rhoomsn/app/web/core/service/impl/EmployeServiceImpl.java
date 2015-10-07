package com.rhoomsn.app.web.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rhoomsn.app.web.entity.Employe;
import com.rhoomsn.app.web.core.dao.EmployeDao;
import com.rhoomsn.app.web.core.service.EmployeService;

@Service
public class EmployeServiceImpl implements EmployeService {
	
	@Autowired
	private EmployeDao employeDao;

	@Override
	public List<Employe> getEmployes() throws Exception {
		
		List<Employe> employeList = employeDao.findAll(); 
		return employeList;
	}
	

}
