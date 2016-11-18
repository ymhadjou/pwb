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
import org.lip6.struts.actionForm.AddContactValidationForm;
import org.lip6.struts.actionForm.ModifyContactValidationForm;
import org.lip6.struts.domain.DAOContact;
import org.lip6.struts.services.ContactService;

/**
 * Servlet implementation class ModifyContactAction
 */
public class ModifyContactAction extends Action {
	
		public ActionForward execute(final ActionMapping pMapping, ActionForm pForm, final HttpServletRequest pRequest,
				final HttpServletResponse pResponse) 
			{
				final ModifyContactValidationForm lForm=(ModifyContactValidationForm)pForm;
				
				final int id = lForm.getId();
				final String firstName = lForm.getFirstName();
				final String lastName = lForm.getLastName();
				final String email = lForm.getEmail();
				
				//create a new Contact
				ContactService cs = new ContactService();
				
				final String lError = cs.modifyContact(id, lastName, firstName, email);
				
				if(lError == null) {
				//if no exception is raised, forward "success"
				return pMapping.findForward("success");
				}
				else {
				//If any exception, return the "error" forward
				return pMapping.findForward("error");
				}
			}//ActionForward

	

}
