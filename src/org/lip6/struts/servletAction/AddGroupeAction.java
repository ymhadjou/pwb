package org.lip6.struts.servletAction;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.lip6.struts.actionForm.AddGroupValidationForm;
import org.lip6.struts.actionForm.AddTelephoneValidationForm;
import org.lip6.struts.domain.DAOGroupe;
import org.lip6.struts.domain.DAOTelephone;

/**
 * Servlet implementation class AddGroupeAction
 */
public class AddGroupeAction extends Action {

	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		final AddGroupValidationForm lForm=(AddGroupValidationForm)form;
		
		final String nomGroupe = lForm.getNomGroupe();

		//create a new Contact
		final DAOGroupe lDAOContact = new DAOGroupe();
		
		final String lError = lDAOContact.CreateGroupDAO(nomGroupe);
		
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
