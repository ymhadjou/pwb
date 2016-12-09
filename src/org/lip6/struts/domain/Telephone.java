package org.lip6.struts.domain;

public class Telephone {
	
	private int id;
	private String typeTelephone;
	private String numTelephone;
	
	//affichage
	private String nom;
	private String prenom;
	
	public Telephone(int id, String typeTelephone, String numTelephone) {
		this.id = id;
		this.typeTelephone = typeTelephone;
		this.numTelephone = numTelephone;
	}
	
	public Telephone(int idTelephone, String nom, String prenom, String num) {
		// TODO Auto-generated constructor stub
		this.id = idTelephone;
		this.nom = nom;
		this.prenom = prenom;
		this.numTelephone = num;
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
	
	public String toString()
	{
		return "["+id+"] " + nom + " " + prenom +" " + numTelephone;
	}
	
	

}
