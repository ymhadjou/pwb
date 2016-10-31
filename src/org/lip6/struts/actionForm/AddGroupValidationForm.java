package org.lip6.struts.actionForm;


import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class AddGroupValidationForm extends ActionForm {
	
	private static final long serialVersionUID = 1L;
	
	private String nomGroupe;

	public String getNomGroupe() {
		return nomGroupe;
	}

	public void setNomGroupe(String nomGroupe) {
		this.nomGroupe = nomGroupe;
	}
	
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		
		this.nomGroupe=null;

	}
	
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request ) {
		
		ActionErrors errors = new ActionErrors();
		
		if( getNomGroupe()== null || getNomGroupe().length() < 1 ) 
		{
			errors.add("groupe",new ActionMessage("creation.addGroupe.error.required"));
		}
		

		return errors;
	}

}
