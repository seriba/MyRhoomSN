package com.rhoomsn.app.web.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rhoomsn.app.web.entity.Typeconge;
import com.rhoomsn.app.web.core.dao.TypeCongeDao;
import com.rhoomsn.app.web.core.service.TypeCongeService;;

@Service
public class TypeCongeServiceImpl implements TypeCongeService {
	
	@Autowired
	private TypeCongeDao typecongeDoa;

	@Override
	public List<Typeconge> getTypeConge() throws Exception {
		
		List<Typeconge> TypeCongeList = typecongeDoa.findAll(); 
		return TypeCongeList;
	}
	

}
