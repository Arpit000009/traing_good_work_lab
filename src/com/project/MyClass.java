package com.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyClass {
	public static void main(String[] args) throws SQLException {
		System.out.println("Hello world");
		String url = "jdbc:postgresql://localhost:5432/testdb";
		String username = "postgres";
		String password = "IAMARPIT";
		Connection conn = DriverManager.getConnection(url,username,password);
//		if(conn!= null) {
//			System.out.println("connection");
//		}
//		else {
//			System.out.println("connection failed");
//		}
		String querry = "select * from employee";
		Statement ps = conn.createStatement();
		ResultSet rs= ps.executeQuery(querry);
		while(rs.next()) {
			System.out.println(rs.getString("emp_id")+"::"+rs.getString("emp_name"));
		}
	}
}
