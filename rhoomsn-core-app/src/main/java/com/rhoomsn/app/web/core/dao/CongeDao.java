package com.rhoomsn.app.web.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rhoomsn.app.web.core.mod.CongeMod;
import com.rhoomsn.app.web.entity.Conge;



@Repository
public interface CongeDao extends JpaRepository<Conge, Long> {
	
}
