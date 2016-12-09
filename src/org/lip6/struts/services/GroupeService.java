package org.lip6.struts.services;

import java.util.ArrayList;

import org.lip6.struts.domain.Contact;
import org.lip6.struts.domain.DAOGroupe;
import org.lip6.struts.domain.Groupe;

public class GroupeService {
	
	private DAOGroupe dao;
	
	public GroupeService()
	{
		dao = new DAOGroupe();
	}
	
	public String addGroup (String nomGroupe)
	{
		return dao.CreateGroupDAO(nomGroupe);
	}
	
	public String modifyGroup (int id,String nomGroupe)
	{
		return dao.ModifyGroupDAO(id, nomGroupe);
	}
	
	public String deleteGroup (int id)
	{
		return dao.DeleteGroupDAO(id);
	}
	
	public String addContactToGroup (int idContact, int idGroupe)
	{
		return dao.AddContactToGroupDAO(idContact, idGroupe);
	}
	
	public String deleteContactFromGroup (int idContact, int idGroupe)
	{
		return dao.DeleteContactFromGroupDAO(idContact, idGroupe);
	}
	
	public ArrayList<Groupe> listeGroupes()
	{
		return dao.getAllGroups();
	}
	
	
	
	

}
