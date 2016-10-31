package org.lip6.struts.actionForm;


import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class AddTelephoneValidationForm extends ActionForm {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String typeTelephone;
	private String numTelephone;
	
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
	
public void reset(ActionMapping mapping, HttpServletRequest request) {
		
		this.id=0;
		this.typeTelephone=null;
		this.numTelephone=null;
	}

public ActionErrors validate(ActionMapping mapping, HttpServletRequest request ) {
	
	ActionErrors errors = new ActionErrors();
	
	if( getTypeTelephone()== null || getTypeTelephone().length() < 1 ) 
	{
		errors.add("typeTelephone",new ActionMessage("creation.typeTel.error.required"));
	}
	
	if( getNumTelephone()== null || getNumTelephone().length() < 1 ) 
	{
		errors.add("numTelephone",new ActionMessage("creation.numTel.error.required "));
	}
	

	return errors;
}
	
	

}
