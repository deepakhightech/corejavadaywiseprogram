package com.destination.sepbatchprogramming.sep18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class check {
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/deepak","root","deepakhightech@123");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from dkrecord");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			}
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
