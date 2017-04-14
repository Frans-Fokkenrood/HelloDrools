package com.fokkenrood.drools;

public class Automaat {
	String	automaatID					= null;
	String	moment						= null;
	int		temperatuur					= -1;
	boolean	aanwezig					= true;
	String	status						= null;
	
	public String getAutomaatID() {
		return automaatID;
	}
	public void setAutomaatID(String automaatID) {
		this.automaatID = automaatID;
	}
	
	public String getMoment() {
		return moment;
	}
	public void setMoment(String moment) {
		this.moment = moment;
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
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}	// end class
