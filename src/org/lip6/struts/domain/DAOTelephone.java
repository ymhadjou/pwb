package org.lip6.struts.domain;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;

public class DAOTelephone {
	
	public DAOTelephone()
	{		
	}
	
	public String CreatePhoneDAO(String typeTel, String num, int idContact)
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
					 requete = "INSERT INTO telephone(typeTelephone,numeroTelephone, fk_idContact_telephone) VALUES " + "('" + typeTel +"','" + num + "','" + idContact +"')";
					 System.out.println(requete);
					 int nb = stmt.executeUpdate(requete);
					 System.out.println("Nombre de lignes mises � jour = " + nb);

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
	
	public String ModifyPhoneDAO(String typeTel, String num, int idContact)
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
					 requete = "UPDATE telephone SET typeTelephone = '" + typeTel + "', numeroTelephone = '" + num + "' WHERE id = '" + idContact + "'";
					// requete ="UPDATE telephone AS t INNER JOIN contact AS c ON t.fk_idContact_telephone = c.id SET t.typeTelephone ="+typeTel+", t.numeroTelephone = "+num+"WHERE t.id = 3 "
					 
					 System.out.println(requete);
					 int nb = stmt.executeUpdate(requete);
					 System.out.println("Nombre de lignes affect�es = " + nb);
					 
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
	
	public String DeletePhoneDAO(int id)
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
			 requete = "DELETE FROM telephone WHERE id = '" + id + "'";
			 int nb = stmt.executeUpdate(requete);
			 System.out.println("Nombre de lignes supprim�es = " + nb+ "id identifi�" + id);
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
	
	public String FetchPhoneDAO(int id)
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
			 requete = "SELECT * FROM telephone WHERE fk_idContact_telephone = '" + id  + "'";
			 ResultSet rs = stmt.executeQuery(requete);
			 while(rs.next())
			 {
				 System.out.println("Type : " + rs.getString("typeTelephone") +" \nNumero: " + rs.getString("numeroTelephone"));
			 }
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
	
	public ArrayList<Telephone> displayPhoneByContact()
	{
		ArrayList<Telephone> listephone = new ArrayList<Telephone>();
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
			 requete = "select c.nom, c.prenom, t.id, t.numeroTelephone from contact c, telephone t where c.id= t.fk_idContact_telephone";
			 ResultSet rs = stmt.executeQuery(requete);
				
				while(rs.next())
				{
					int idTelephone = rs.getInt("t.id");
					String nom = rs.getString("c.nom");
					String prenom = rs.getString("c.prenom");
					String num = rs.getString("t.numeroTelephone");
					listephone.add(new Telephone(idTelephone,nom,prenom,num));
				}

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
		return listephone;
	}

}
