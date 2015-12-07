package com.rhoomsn.app.web.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rhoomsn.app.web.core.mod.EmployeMod;
import com.rhoomsn.app.web.entity.Employe;



@Repository
public interface EmployeDao extends JpaRepository<Employe, Long> {
	@Query("SELECT e from Employe e where e.nomEmploye='diop'")
	Employe findByNomEmploye();
}
