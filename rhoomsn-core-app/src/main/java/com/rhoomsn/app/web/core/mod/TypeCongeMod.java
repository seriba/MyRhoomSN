package com.rhoomsn.app.web.core.mod;

import com.rhoomsn.app.web.entity.Typeconge;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class TypeCongeMod {
	
	private int TypeConge;
	private String libelleConge;

	public void  TypeConge() {
	}

	public int getTypeConge() {
		return this.TypeConge;
	}

	public void setTypeConge(int TypeConge) {
		this.TypeConge = TypeConge;
	}
	
	public String getlibelleConge() {
		return this.libelleConge;
	}

	public void setlibelleConge(String libelleConge) {
		this.libelleConge = libelleConge;
	}

	
}
