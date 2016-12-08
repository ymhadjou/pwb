package org.lip6.struts.domain;

public class Address {
	
	private int id;
	private String street;
	private String city;
	private String country;
	private String zip;
	
	
	public Address(int id,String street, String city, String country,String zip) {
		this.id = id;
		this.street = street;
		this.city = city;
		this.country = country;
		this.zip = zip;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public int getId() {
	return id;
	}

	public void setId(int l) {
	id = l;
	}
	
	public String toString()
	{
		return "("+id+")"+street +","+city+","+zip+","+country;
	}

}
