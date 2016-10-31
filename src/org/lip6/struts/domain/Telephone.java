package org.lip6.struts.domain;

public class Telephone {
	
	private int id;
	private String typeTelephone;
	private String numTelephone;
	
	
	
	public Telephone(int id, String typeTelephone, String numTelephone) {
		this.id = id;
		this.typeTelephone = typeTelephone;
		this.numTelephone = numTelephone;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTypeTelephone() {
		return typeTelephone;
	}
	public void setTypeTelephone(String typeTelephone) {
		this.typeTelephone = typeTelephone;
	}
	public String getNumTelephone() {
		return numTelephone;
	}
	public void setNumTelephone(String numTelephone) {
		this.numTelephone = numTelephone;
	}
	
	

}
