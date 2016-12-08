package org.lip6.struts.services;

import java.util.ArrayList;

import org.lip6.struts.domain.Address;
import org.lip6.struts.domain.DAOAddress;


public class AdresseService {
	
	private DAOAddress dao;
	
	public AdresseService()
	{
		dao = new DAOAddress();
	}
	
	public String addAdress (String street, String city, String zip, String country)
	{
		return dao.CreateAddressDAO(street, city, zip, country);
	}
	
	public String modifyAddress(String street, String city, String zip, String country, int idContact)
	{
		return dao.ModifyAddressDAO(street, city, zip, country, idContact);
	}
	
	public String deleteAddress(int id)
	{
		return dao.DeleteAddressDAO(id);
	}
	
	public String getAddressForAContact(int id)
	{
		return dao.FetchAddressDAO(id);
	}
	
	public ArrayList<Address> getAllAddress()
	{
		return dao.getAllAddresses();
	}

	
	
	
	
	
	

}
