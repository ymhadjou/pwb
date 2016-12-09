package org.lip6.struts.services;

import java.util.ArrayList;

import org.lip6.struts.domain.DAOTelephone;
import org.lip6.struts.domain.Groupe;
import org.lip6.struts.domain.Telephone;

public class PhoneService {
	
	private DAOTelephone dao;
	
	public PhoneService()
	{
		dao = new DAOTelephone();
	}
	
	public String addPhone (String typeTel, String num, int idContact)
	{
		return dao.CreatePhoneDAO(typeTel, num, idContact);
	}
	
	public String modifyPhone (String typeTel, String num, int idContact)
	{
		return dao.ModifyPhoneDAO(typeTel, num, idContact);
	}
	
	public String deletePhone (int id)
	{
		return dao.DeletePhoneDAO(id);
	}
	
	public String fetchPhone (int id)
	{
		return dao.FetchPhoneDAO(id);
	}
	
	public ArrayList<Telephone> listePhone()
	{
		return dao.displayPhoneByContact();
	}
	
	
	
	
	

}
