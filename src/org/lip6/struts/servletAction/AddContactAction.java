package org.lip6.struts.servletAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.Globals;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.lip6.struts.actionForm.AddContactValidationForm;
import org.lip6.struts.domain.Contact;
import org.lip6.struts.domain.DAOContact;
import org.lip6.struts.services.ContactService;
public class AddContactAction extends Action {
	
	public ActionForward execute(final ActionMapping pMapping, ActionForm pForm, final HttpServletRequest pRequest,
																							final HttpServletResponse pResponse) 
	{
		final AddContactValidationForm lForm=(AddContactValidationForm)pForm;
		
		final int id = lForm.getId();
		final String firstName = lForm.getFirstName();
		final String lastName = lForm.getLastName();
		final String email = lForm.getEmail();
		final int idAdresse = lForm.getIdAdresse();
		
		//create a new Contact
		//final DAOContact lDAOContact = new DAOContact();
		ContactService cs = new ContactService();
		
		final Contact lError = cs.addContact(id, firstName, lastName, email,idAdresse);
		System.out.println("action : "+idAdresse);
		
		if(lError == null) {
			//if no exception is raised, forward "success"
			//return pMapping.findForward("success");
			return pMapping.findForward("error");
			}
			else {
			//If any exception, return the "error" forward
			//return pMapping.findForward("error");
				return pMapping.findForward("success");
		}
	}//ActionForward
}
