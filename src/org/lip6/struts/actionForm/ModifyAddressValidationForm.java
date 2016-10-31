package org.lip6.struts.actionForm;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class ModifyAddressValidationForm extends ActionForm {
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String street = null;
	private String city= null;
	private String country= null;
	private String zip= null;
	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public int getId() {
	return id;
	}

	public void setId(int l) {
	id = l;
	}
	
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		
		this.id=0;
		this.street=null;
		this.city=null;
		this.zip=null;
		this.country=null;
	}
	
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request ) {
		
		ActionErrors errors = new ActionErrors();
		
		if( getStreet()== null || getStreet().length() < 1 ) 
		{
			errors.add("street",new ActionMessage("creation.address.street"));
		}
		
		if( getCity()== null || getCity().length() < 1 ) 
		{
			errors.add("city",new ActionMessage("creation.address.city"));
		}
		
		if( getZip() == null || getZip().length() < 1 ) 
		{
			errors.add("zip", new ActionMessage("creation.address.zip"));
		}
		if( getCountry() == null || getCountry().length() < 1 ) 
		{
			errors.add("country", new ActionMessage("creation.address.country"));
		}
		return errors;
	}

}
