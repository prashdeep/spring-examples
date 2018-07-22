package com.edureka.spring.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PlainJDBCDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/students", "root", "welcome");
			statement = connection.createStatement();
			rs = statement.executeQuery("select * from student");
			while (rs.next()) {
				System.out.println("Id: "+ rs.getInt(1));
				System.out.println("Name: "+rs.getString(2));
				System.out.println("Age: "+rs.getInt(3));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
