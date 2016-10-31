package org.lip6.struts.actionForm;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class SearchAddressValidationForm extends ActionForm {
	
private static final long serialVersionUID = 1L;
	
	private int id ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		
		this.id=0;
	}
	

	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request ) {
		
		ActionErrors errors = new ActionErrors();
		
		if( getId()== 0 || getId() < 1 ) 
		{
			errors.add("id",new ActionMessage("creation.id.error.required"));
		}

		return errors;
	}

}
