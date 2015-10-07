package com.rhoomsn.app.web.core.mod;

import com.rhoomsn.app.web.entity.Contrat;
import java.util.List;

public class ContratMod {
	
	private int code;
	
	private String libelleContrat;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getLibelleContrat() {
		return libelleContrat;
	}

	public void setLibelleContrat(String libelleContrat) {
		this.libelleContrat = libelleContrat;
	}
	
	public ContratMod(){
		
	}

	public ContratMod(Contrat contrat) {
		this.code = contrat.getCode();
		this.libelleContrat = contrat.getLibelleContrat();
	}
	
	
	
	
}
