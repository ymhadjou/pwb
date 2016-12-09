package org.lip6.struts.domain;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;


public class DAOContact {

	
	public DAOContact()
	{

	}
	
	
	public Contact createContact(int Did, String Dnom, String Dprenom, String Dmail, int idAdresse)
	{
		System.out.println("Creation du compte : "+Did +Dnom+" | "+Dprenom+" | "+Dmail);
		Contact c = null;
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/gestioncontact";
		String uid = "root"; String passwd = "";
		String requete;
		Connection cx = null;
		Statement stmt = null;
		
		try {
			Class.forName(driver);
			cx = DriverManager.getConnection(url, uid, passwd);
			stmt = cx.createStatement();
			requete = "INSERT INTO Contact(id,nom,prenom,mail,fk_idAdresse) VALUES " + "('" + Did +"','" + Dnom + "','" + Dprenom + "','" + Dmail + "','"+idAdresse+ "')";
			c = new Contact(Did,Dnom,Dprenom,Dmail,idAdresse);
			
			int nb = stmt.executeUpdate(requete);
			System.out.println("Nombre de lignes mises � jour = " + nb);
			//return null;
			
			} catch (ClassNotFoundException e) {
				
				// classe du pilote introuvable
				
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			} finally {
			try { 
				if (stmt != null) stmt.close();
				if (cx != null) cx.close();}
			catch (SQLException e) { e.printStackTrace(); }
			
			}
		
		return c;
				

	}
	
	


	public String researchContact(int Did) {
		// TODO Auto-generated method stub
		//System.out.println("Le contact -" + Dnom + "- a �t� cr��.");
		
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/gestioncontact";
		String uid = "root"; String passwd = "";
		String requete;
		Connection cx = null;
		Statement stmt = null;
		
		try {
			Class.forName(driver);
			cx = DriverManager.getConnection(url, uid, passwd);
			stmt = cx.createStatement();
			requete = "SELECT * FROM Contact where id = '" + Did +"'";
			ResultSet rs = stmt.executeQuery(requete);
			
			while(rs.next())
			{
				System.out.println("Id : " + rs.getString("id") +
								"\n Nom : "+ rs.getString("nom")+
								"\n Prenom :" + rs.getString("prenom") +
								"\n Mail:" + rs.getString("mail"));
			}
					
			
			} catch (ClassNotFoundException e) {
				
				// classe du pilote introuvable
				
			} catch (SQLException e) {
				
				System.out.println(e.toString());
				
			} finally {
			try { 
				if (stmt != null) stmt.close();
				if (cx != null) cx.close();}
			catch (SQLException e) { e.printStackTrace(); }
			}
		return null;
	}

	public String updateContact(int Did, String Dnom, String Dprenom, String Dmail,int idAdresse) {
		// TODO Auto-generated method stub
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/gestioncontact";
		String uid = "root"; String passwd = "";
		String requete;
		Connection cx = null;
		Statement stmt = null;
		
		try {
			Class.forName(driver);
			cx = DriverManager.getConnection(url, uid, passwd);
			stmt = cx.createStatement();
			requete = "UPDATE Contact SET nom='"+Dnom+"',prenom='"+Dprenom+"',mail='"+Dmail+"',fk_idAdresse='"+idAdresse+"' WHERE id='"+Did+"'";
			int nb = stmt.executeUpdate(requete);
			System.out.println("nb de ligne ajout�="+nb);
					
			
			} catch (ClassNotFoundException e) {
				
				// classe du pilote introuvable
				
			} catch (SQLException e) {
				
				System.out.println(e.toString());
				
			} finally {
			try { 
				if (stmt != null) stmt.close();
				if (cx != null) cx.close();}
			catch (SQLException e) { e.printStackTrace(); }
			}
		return null;
	}

	public String deleteContact(int Did) {
		// TODO Auto-generated method stub
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/gestioncontact";
		String uid = "root"; String passwd = "";
		String requete;
		Connection cx = null;
		Statement stmt = null;
		
		try {
			Class.forName(driver);
			cx = DriverManager.getConnection(url, uid, passwd);
			stmt = cx.createStatement();
			requete = "DELETE FROM Contact where id='"+ Did +"'";
			int nb = stmt.executeUpdate(requete);
			System.out.println("nb de ligne supprim�="+nb +"/n id du contact supprim�" + Did);
			
					
			} catch (ClassNotFoundException e) {
				
				// classe du pilote introuvable
				
			} catch (SQLException e) {
				
				System.out.println(e.toString());
				
			} finally {
			try { 
				if (stmt != null) stmt.close();
				if (cx != null) cx.close();}
			catch (SQLException e) { e.printStackTrace(); }
			}
		return null;
	}
	
	public ArrayList<Contact> listContacts(){
		ArrayList<Contact> liste = new ArrayList<Contact>();
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/gestioncontact";
		String uid = "root"; String passwd = "";
		String requete;
		Connection cx = null;
		Statement stmt = null;
		
		try
		{
			Class.forName(driver);
			cx = DriverManager.getConnection(url, uid, passwd);
			stmt = cx.createStatement();
			requete = "select * from contact";
			ResultSet rs = stmt.executeQuery(requete);
			
				while(rs.next())
				{
					int id = rs.getInt("id");
					String lastName = rs.getString("nom");
					String firstName = rs.getString("prenom");
					String email = rs.getString("mail");
					int idAdresse = rs.getInt("fk_idAdresse");
					
					liste.add(new Contact(id, lastName, firstName, email, idAdresse));
				}
			} catch (ClassNotFoundException e) {
				
				// classe du pilote introuvable
				
			} catch (SQLException e) {
				
				System.out.println(e.toString());
				
			} finally {
			try { 
				if (stmt != null) stmt.close();
				if (cx != null) cx.close();}
			catch (SQLException e) { e.printStackTrace(); }
			}
		
		
		return liste;
		
	}
	
	public ArrayList<Contact> listContactsWithPhone(){
		ArrayList<Contact> liste = new ArrayList<Contact>();
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/gestioncontact";
		String uid = "root"; String passwd = "";
		String requete;
		Connection cx = null;
		Statement stmt = null;
		
		try
		{
			Class.forName(driver);
			cx = DriverManager.getConnection(url, uid, passwd);
			stmt = cx.createStatement();
			requete = "select c.id, nom, prenom from contact c, telephone where fk_idContact_telephone = c.id ";
			ResultSet rs = stmt.executeQuery(requete);
			
				while(rs.next())
				{
					int id = rs.getInt("id");
					String lastName = rs.getString("nom");
					String firstName = rs.getString("prenom");
					
					liste.add(new Contact(id, lastName, firstName));
				}
			} catch (ClassNotFoundException e) {
				
				// classe du pilote introuvable
				
			} catch (SQLException e) {
				
				System.out.println(e.toString());
				
			} finally {
			try { 
				if (stmt != null) stmt.close();
				if (cx != null) cx.close();}
			catch (SQLException e) { e.printStackTrace(); }
			}
		
		
		return liste;
		
	}
	
}


