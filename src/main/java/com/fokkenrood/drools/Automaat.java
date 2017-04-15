package com.fokkenrood.drools;

public class Automaat {
	String	dagdeel						= null;
	int		temperatuur					= -1;
	boolean	aanwezig					= true;
	String	regel						= null;
	String	status						= null;
	
	public String getDagdeel() {
		return dagdeel;
	}
	public void setDagdeel(String dagdeel) {
		this.dagdeel = dagdeel;
	}
	
	public int getTemperatuur() {
		return temperatuur;
	}
	public void setTemperatuur(int temperatuur) {
		this.temperatuur = temperatuur;
	}
		
	public boolean isAanwezig() {
		return aanwezig;
	}
	public void setAanwezig(boolean aanwezig) {
		this.aanwezig = aanwezig;
	}
	
	public String getRegel() {
		return regel;
	}
	public void setRegel(String regel) {
		this.regel = regel;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}	// end class
