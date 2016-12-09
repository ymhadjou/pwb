package org.lip6.struts.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.lip6.struts.services.AdresseService;


public class DAOAddress {
	
	public DAOAddress()
	{

			
	}
	
	
	public String CreateAddressDAO(String street, String city, String cp, String country)
	{
		//Configuration
		String driver ="com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/gestioncontact";
		String user ="root";
		String password ="";
		String requete;
		Connection cx = null;
		Statement stmt = null;
		
		try
		{
			//Configuration
			Class.forName(driver);
			cx = DriverManager.getConnection(url, user, password);
			
			//Statement
			 stmt = cx.createStatement();
			 requete = "INSERT INTO adresse(rue,ville,cp,pays) VALUES " + "('" + street +"','" + city + "','" + cp + "','" + country + "')";
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
	
	
	public String ModifyAddressDAO(String street, String city, String cp, String country, int idContact)
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
			//update adresse set rue="2", ville="sseeoouul", cp="hhh", pays="australie" where id = (select fk_idAdresse from contact where id=2)
			 stmt = cx.createStatement();
			 //requete = "UPDATE adresse SET rue = '" + street + "', ville = '" + city + "', cp = '" + cp + "', pays = '" + country + "' WHERE fk_idContact_adresse = '" + idContact + "'";
			 requete ="update adresse set rue="+street+", ville="+city+", cp="+cp+", pays="+country+" where id = (select fk_idAdresse from contact where id="+idContact+")";
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
	
	public String DeleteAddressDAO(int id)
	{
		//Configuration
		String driver ="com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/gestioncontact";
		String user ="root";
		String password ="";
		String requete="";
		String requetecontact ="";
		Connection cx = null;
		Statement stmt = null;
			try
			{
				//Configuration
				Class.forName(driver);
				cx = DriverManager.getConnection(url, user, password);
				
				//Statement
				 stmt = cx.createStatement();
				 requetecontact = "UPDATE Contact SET fk_idAdresse=0 where fk_idAdresse='" + id + "'";
				 int nb1 = stmt.executeUpdate(requetecontact);
				 System.out.println("Nombre de lignes contact modifié à 0 = " + nb1);
				 requete = "DELETE FROM Adresse WHERE id = '" + id + "'";
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
	
	public String FetchAddressDAO(int id)
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
			 requete = "SELECT * FROM adresse WHERE fk_idContact_adresse = '" + id  + "'";
			 System.out.println(requete);
			 ResultSet rs = stmt.executeQuery(requete);
			 while(rs.next())
			 {
				 System.out.println("Rue : " + rs.getString("rue") +" \nVille: " + rs.getString("ville") + "\nCP : " + rs.getString("cp") + "\nPays : " +rs.getString("pays"));
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
	
	public ArrayList<Address> getAllAddresses() 
	{
		ArrayList<Address> list = new ArrayList<Address>();

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
			requete = "select * from adresse";
			ResultSet rs = stmt.executeQuery(requete);
			
				while(rs.next())
				{
					int id = rs.getInt("id");
					String street = rs.getString("rue");
					String city = rs.getString("ville");
					String zip = rs.getString("cp");
					String country = rs.getString("pays");
					
					list.add(new Address(id,street,city,zip,country) );
					System.out.println(" rue: "+ street+"ville : "+city+zip+country);
				}
			} catch (ClassNotFoundException e) {
				
				
			} catch (SQLException e) {
				
				System.out.println(e.toString());
				
			} finally {
			try { 
				if (stmt != null) stmt.close();
				if (cx != null) cx.close();}
			catch (SQLException e) { e.printStackTrace(); }
			}

		return list;
		
	}
	
}
