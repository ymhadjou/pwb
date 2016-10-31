package org.lip6.struts.servletAction;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.lip6.struts.actionForm.DeleteContactFromGroupValidationForm;
import org.lip6.struts.actionForm.DeleteGroupValidationForm;
import org.lip6.struts.domain.DAOGroupe;

/**
 * Servlet implementation class DeleteContactFromGroupAction
 */
public class DeleteContactFromGroupAction extends Action  {
       
	public ActionForward execute(final ActionMapping pMapping, ActionForm pForm, final HttpServletRequest pRequest,
			final HttpServletResponse pResponse) 
		{
		final DeleteContactFromGroupValidationForm lForm=(DeleteContactFromGroupValidationForm)pForm;
			
			final int id = lForm.getId();
			final int idGroup = lForm.getidGroupe();

			
			//create a new Contact
			final DAOGroupe lDAOContact = new DAOGroupe();
			
			final String lError = lDAOContact.DeleteContactFromGroupDAO(id, idGroup);
			
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
