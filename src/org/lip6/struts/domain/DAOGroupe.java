package org.lip6.struts.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class DAOGroupe {
	
	public DAOGroupe()
	{
		
	}
	
	public String CreateGroupDAO(String nomGroupe)
	{
		//Configuration
		String driver ="com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/gestioncontact";
		String user ="root";
		String password ="";
		String requete="";
		Connection cx = null;
		Statement stmt = null;
		
		try
		{
			//Configuration
			Class.forName(driver);
			cx = DriverManager.getConnection(url, user, password);
			
			//Statement
			 stmt = cx.createStatement();
			 requete = "INSERT INTO groupe(nomGroupe) VALUES " + "('" + nomGroupe +"')";
			 System.out.println(requete);
			 int nb = stmt.executeUpdate(requete);
			 System.out.println("Nombre de lignes mises à jour = " + nb);

		}
		catch(ClassNotFoundException e)
		{
			e.toString();
		}
		catch(SQLException e)
		{
			e.toString();
		}
		finally
		{
			try
			{
				if(cx!=null)
				{
					cx.close();
				}
				if(stmt!=null)
				{
					stmt.close();
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		} 
		return null;
	}
	
	public String ModifyGroupDAO(int id, String nomGroupe)
	{
		//Configuration
		String driver ="com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/gestioncontact";
		String user ="root";
		String password ="";
		String requete="";
		Connection cx = null;
		Statement stmt = null;
		try
		{
			//Configuration
			Class.forName(driver);
			cx = DriverManager.getConnection(url, user, password);
			
			//Statement
			 stmt = cx.createStatement();
			 requete = "UPDATE groupe SET nomGroupe = '" + nomGroupe + "' WHERE idGroupe = '" + id + "'";
			 System.out.println(requete);
			 int nb = stmt.executeUpdate(requete);
			 System.out.println("Nombre de lignes affectées = " + nb);
			 
		}
		catch(ClassNotFoundException e)
		{
			e.toString();
		}
		catch(SQLException e)
		{
			e.toString();
		}
		finally
		{
			try
			{
				if(cx!=null)
				{
					cx.close();
				}
				if(stmt!=null)
				{
					stmt.close();
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public String DeleteGroupDAO(int id)
	{
		//Configuration
		String driver ="com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/gestioncontact";
		String user ="root";
		String password ="";
		String requete="";
		Connection cx = null;
		Statement stmt = null;
				try
				{
					//Configuration
					Class.forName(driver);
					cx = DriverManager.getConnection(url, user, password);
						
					//Statement
					 stmt = cx.createStatement();
					 requete = "DELETE FROM groupe WHERE idGroupe = '" + id + "'";
					 System.out.println(requete);
					 int nb = stmt.executeUpdate(requete);
					 System.out.println("Nombre de lignes supprimées = " + nb);
				}
				catch(ClassNotFoundException e)
				{
					e.toString();
				}
				catch(SQLException e)
				{
					e.toString();
				}
				finally
				{
					try
					{
						if(cx!=null)
						{
							cx.close();
						}
						if(stmt!=null)
						{
							stmt.close();
						}
					}
					catch(SQLException e)
					{
						e.printStackTrace();
					}
				}
				return null;
		}
	
	public String AddContactToGroupDAO(int idContact, int idGroupe)
	{
		//Configuration
				String driver ="com.mysql.jdbc.Driver";
				String url = "jdbc:mysql://localhost:3306/gestioncontact";
				String user ="root";
				String password ="";
				String requete="";
				Connection cx = null;
				Statement stmt = null;
				
				try
				{
					//Configuration
					Class.forName(driver);
					cx = DriverManager.getConnection(url, user, password);
					
					//Statement
					 stmt = cx.createStatement();
					 requete = "INSERT INTO contact_groupe(idGroupe, idContact) VALUES " + "('" + idGroupe +"','"+idContact+"')";
					 System.out.println(requete);
					 int nb = stmt.executeUpdate(requete);
					 System.out.println("Nombre de lignes mises à jour = " + nb);

				}
				catch(ClassNotFoundException e)
				{
					e.toString();
				}
				catch(SQLException e)
				{
					e.toString();
				}
				finally
				{
					try
					{
						if(cx!=null)
						{
							cx.close();
						}
						if(stmt!=null)
						{
							stmt.close();
						}
					}
					catch(SQLException e)
					{
						e.printStackTrace();
					}
				}
				return null;
		}
	
	public String DeleteContactFromGroupDAO(int idContact, int idGroupe)
	{
		//Configuration
				String driver ="com.mysql.jdbc.Driver";
				String url = "jdbc:mysql://localhost:3306/gestioncontact";
				String user ="root";
				String password ="";
				String requete="";
				Connection cx = null;
				Statement stmt = null;
						try
						{
							//Configuration
							Class.forName(driver);
							cx = DriverManager.getConnection(url, user, password);
								
							//Statement
							 stmt = cx.createStatement();
							 requete = "DELETE FROM contact_groupe WHERE idGroupe = '" + idGroupe + "' AND idContact = '" + idContact + "'";
							 System.out.println(requete);
							 int nb = stmt.executeUpdate(requete);
							 System.out.println("Nombre de lignes supprimées = " + nb);
						}
						catch(ClassNotFoundException e)
						{
							e.toString();
						}
						catch(SQLException e)
						{
							e.toString();
						}
						finally
						{
							try
							{
								if(cx!=null)
								{
									cx.close();
								}
								if(stmt!=null)
								{
									stmt.close();
								}
							}
							catch(SQLException e)
							{
								e.printStackTrace();
							}
						}
						return null;
	}
	
	
	
	public ArrayList<Groupe> getAllGroups(){
		ArrayList<Groupe> listegroupe = new ArrayList<Groupe>();
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
			requete = "select * from groupe";
			ResultSet rs = stmt.executeQuery(requete);
			
				while(rs.next())
				{
					int id = rs.getInt("idGroupe");
					String nomGroupe = rs.getString("nomGroupe");

					
					listegroupe.add(new Groupe(id,nomGroupe));
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
		
		
		return listegroupe;
		
	}

}
