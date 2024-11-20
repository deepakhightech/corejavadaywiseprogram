package com.destination.sepbatchprogramming.sep18;

class Os{
	double version;
	String name;
	public Os(double version, String name) {
		super();
		this.version = version;
		this.name = name;
	}
	public double getVersion() {
		return version;
	}
	public String getName() {
		return name;
	}
	
}
class Charger{
	String company;
	double vlts;
	public Charger(String company, double vlts) {
		super();
		this.company = company;
		this.vlts = vlts;
	}
	public String getCompany() {
		return company;
	}
	public double getVlts() {
		return vlts;
	}
	
}
class Mobile{
	Os os=new Os(4.8,"Mars");
	void hascharger(Charger c) {
		System.out.println(c.getCompany());
		System.out.println(c.getVlts());
	}
}
public class HashArelationship1 {
	public static void main(String[] args) {
		Charger ch=new Charger("sumsung",45);
		Mobile m=new Mobile();
		System.out.println(m.os.getName());
		System.out.println(m.os.getVersion());
		m.hascharger(ch);
	}
	
	
}
