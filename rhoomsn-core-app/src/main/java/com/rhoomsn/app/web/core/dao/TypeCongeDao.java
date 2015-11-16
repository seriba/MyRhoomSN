package com.rhoomsn.app.web.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rhoomsn.app.web.core.mod.TypeCongeMod;
import com.rhoomsn.app.web.entity.Typeconge;



@Repository
public interface TypeCongeDao extends JpaRepository<Typeconge, Long> {
	
}
