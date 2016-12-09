package org.lip6.struts.services;
import java.util.ArrayList;

import org.lip6.struts.domain.Contact;
import org.lip6.struts.domain.DAOContact;

public class ContactService {
	
	private DAOContact dao;
	
	public ContactService()
	{
		dao = new DAOContact();
	}
	
	/*public String addContact (int Did, String Dnom, String Dprenom, String Dmail)
	{
		return dao.createContact(Did, Dnom, Dprenom, Dmail);
	}*/
	
	public Contact addContact (int Did, String Dnom, String Dprenom, String Dmail,int idAdresse)
	{
		System.out.println("service : "+idAdresse);
		return dao.createContact(Did, Dnom, Dprenom, Dmail,idAdresse);
	}
	
	public String modifyContact(int Did, String Dnom, String Dprenom, String Dmail, int idAdresse)
	{
		return dao.updateContact(Did, Dnom, Dprenom, Dmail,idAdresse);
	}
	
	public String researchContact(int id)
	{
		return dao.researchContact(id);
	}
	
	public String deleteContact(int id)
	{
		return dao.deleteContact(id);
	}
	
	
	public ArrayList<Contact> listeContacts()
	{
		return dao.listContacts();
	}
	
	public ArrayList<Contact> listeContactsWithPhone()
	{
		return dao.listContactsWithPhone();
	}

}
