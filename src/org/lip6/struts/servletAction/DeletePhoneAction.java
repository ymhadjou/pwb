package org.lip6.struts.servletAction;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.lip6.struts.actionForm.DeleteContactValidationForm;
import org.lip6.struts.actionForm.DeletePhoneValidationForm;
import org.lip6.struts.domain.DAOContact;
import org.lip6.struts.domain.DAOTelephone;

/**
 * Servlet implementation class DeletePhoneAction
 */
public class DeletePhoneAction extends Action {
	private static final long serialVersionUID = 1L;
       
	public ActionForward execute(final ActionMapping pMapping, ActionForm pForm, final HttpServletRequest pRequest,
			final HttpServletResponse pResponse) 
		{
		final DeletePhoneValidationForm lForm=(DeletePhoneValidationForm)pForm;
			
			final int id = lForm.getId();

			
			//create a new Contact
			final DAOTelephone lDAOContact = new DAOTelephone();
			
			final String lError = lDAOContact.DeletePhoneDAO(id);
			
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
