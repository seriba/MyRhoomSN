package com.rhoomsn.app.web.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rhoomsn.app.web.core.mod.ContratMod;
import com.rhoomsn.app.web.entity.Contrat;



@Repository
public interface ContratDao extends JpaRepository<Contrat, Long> {
	
}
