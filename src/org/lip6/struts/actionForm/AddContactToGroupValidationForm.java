package org.lip6.struts.actionForm;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class AddContactToGroupValidationForm extends ActionForm {
	private static final long serialVersionUID = 1L;
	
	private int id;
	private int idGroupe;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getidGroupe() {
		return idGroupe;
	}
	public void setidGroupe(int idGroupe) {
		this.idGroupe = idGroupe;
	}
	
public void reset(ActionMapping mapping, HttpServletRequest request) {
		
		this.id=0;
		this.idGroupe = 0;
}

public ActionErrors validate(ActionMapping mapping, HttpServletRequest request ) {
	
	ActionErrors errors = new ActionErrors();
	
	if( getId()==0 || getId() < 1 ) 
	{
		errors.add("id",new ActionMessage("creation.id.error.required"));
	}
	
	if( getidGroupe() ==0 || getidGroupe() < 1 ) 
	{
		errors.add("idGroupe",new ActionMessage("creation.addGroupeID.error.required"));
	}

	

	return errors;
}


}
