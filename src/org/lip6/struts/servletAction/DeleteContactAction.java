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
import org.lip6.struts.actionForm.DeleteContactValidationForm;
import org.lip6.struts.domain.DAOContact;

/**
 * Servlet implementation class DeleteContactAction
 */
public class DeleteContactAction extends Action {
	
	public ActionForward execute(final ActionMapping pMapping, ActionForm pForm, final HttpServletRequest pRequest,
			final HttpServletResponse pResponse) 
		{
		final DeleteContactValidationForm lForm=(DeleteContactValidationForm)pForm;
			
			final int id = lForm.getId();

			
			//create a new Contact
			final DAOContact lDAOContact = new DAOContact();
			
			final String lError = lDAOContact.deleteContact(id);
			
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
