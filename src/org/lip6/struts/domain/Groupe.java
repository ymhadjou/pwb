package org.lip6.struts.domain;

import java.util.List;

public class Groupe {
	
	private String nomGroupe;
	private int idGroupe;
	private List <Contact>contacts;
	
	public Groupe(int id,String nomGroupe)
	{
		this.idGroupe = id;
		this.nomGroupe = nomGroupe;
	}

	public int getIdGroupe() {
		return idGroupe;
	}

	public void setIdGroupe(int idGroupe) {
		this.idGroupe = idGroupe;
	}

	public String getNomGroupe() {
		return nomGroupe;
	}

	public void setNomGroupe(String nomGroupe) {
		this.nomGroupe = nomGroupe;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
	
	public String toString()
	{
		return "( "+idGroupe+ ") "+nomGroupe;
		
	}
	

}
