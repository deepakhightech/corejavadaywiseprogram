package com.destination.sepbatchprogramming.sep18;
class Heart{
	String name;
	double time;
	public Heart(String name, double time) {
		super();
		this.name = name;
		this.time = time;
	}
	public String getName() {
		return name;
	}
	
	public double getTime() {
		return time;
	}	
}
class Books{
	String bookname;
	int pages;
	public Books(String bookname, int pages) {
		super();
		this.bookname = bookname;
		this.pages = pages;
	}
	public String getBookname() {
		return bookname;
	}
	public int getPages() {
		return pages;
	}
	
}
class Idcard{
	int id;
	public int getId() {
		return id;
	}
	public String getClgname() {
		return clgname;
	}
	public Idcard(int id, String clgname) {
		super();
		this.id = id;
		this.clgname = clgname;
	}
	String clgname;	
}
class Student{
	Heart hrt=new Heart("deepak's",20);
	void hasbooks(Books b) {
		System.out.println(b.getBookname());
		System.out.println(b.getPages());
	}
	void hasidcard(Idcard idc) {
		System.out.println(idc.getClgname());
		System.out.println(idc.getId());
	}
}
public class HashArelationship2 {
	public static void main(String[] args) {
		Books bk=new Books("java", 400);
		Student st=new Student();
		System.out.println(st.hrt.getName());
		System.out.println(st.hrt.getTime());
		
		st.hasbooks(bk);
		Idcard id=new Idcard(3, "rdpg");
		st.hasidcard(id);
	}
}
