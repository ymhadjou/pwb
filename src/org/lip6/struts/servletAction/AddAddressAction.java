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
import org.lip6.struts.actionForm.AddAddressValidationForm;
import org.lip6.struts.actionForm.AddContactValidationForm;
import org.lip6.struts.domain.DAOAddress;
import org.lip6.struts.domain.DAOContact;
import org.lip6.struts.services.AdresseService;

/**
 * Servlet implementation class AddAddressAction
 */
public class AddAddressAction extends Action {
	private static final long serialVersionUID = 1L;

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm pForm,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
	
		// TODO Auto-generated method stub
		
		
		final AddAddressValidationForm lForm=(AddAddressValidationForm)pForm;
		
		final String street = lForm.getStreet();
		final String city = lForm.getCity();
		final String zip = lForm.getZip();
		final String country = lForm.getCountry();
		
		//create a new Contact
		final AdresseService cs = new AdresseService();
		
		final String lError = cs.addAdress(street, city, zip, country);
		
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
