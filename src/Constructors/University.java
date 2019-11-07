package Constructors;

import java.util.ArrayList;

public class University {
	String name;
	String country;
	String establishedDate;
	ArrayList<String> courses = new ArrayList<String>();
	
	public University(String name) {
		this.name = name;
	}
	
	public University(String name, String country) {
		this.name = name;
		this.country = country;
	}
	
	public University(String name, String country, String establishedDate, ArrayList<String> string) {
		this.name = name;
		this.country = country;
		this.establishedDate = establishedDate;
		this.courses = string;
	}

	public String getName() {
		return name;
	}

	public String getCountry() {
		return country;
	}

	public String getEstablishedDate() {
		return establishedDate;
	}

	public ArrayList<String> getCourses() {
		return courses;
	}

	public static void main(String[] args) {
		University VU= new University("Visweswaraya University");
		ArrayList<String> al=new ArrayList<String>();
		al.add("Enginerring");
		al.add("Medical");
		al.add("PUC");
		University MysoreUniv= new University("Mysore University", "India", "01-01-1947", al);
		
	}

}
