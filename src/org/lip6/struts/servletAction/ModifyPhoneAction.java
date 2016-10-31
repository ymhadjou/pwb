package org.lip6.struts.servletAction;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.lip6.struts.actionForm.AddTelephoneValidationForm;
import org.lip6.struts.actionForm.ModifyPhoneValidationForm;
import org.lip6.struts.domain.DAOTelephone;

/**
 * Servlet implementation class ModifyPhoneAction
 */
public class ModifyPhoneAction extends Action {
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		final ModifyPhoneValidationForm lForm=(ModifyPhoneValidationForm)form;
		
		final int id = lForm.getId();
		final String typeTel = lForm.getTypeTelephone();
		final String numTel = lForm.getNumTelephone();

		//create a new Contact
		final DAOTelephone lDAOContact = new DAOTelephone();
		
		final String lError = lDAOContact.ModifyPhoneDAO(typeTel, numTel, id);
		
		if(lError == null) {
			//if no exception is raised, forward "success"
			return mapping.findForward("success");
			}
			else {
			//If any exception, return the "error" forward
			return mapping.findForward("error");
		}
	}

}
