package com.exception.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
	public static void main(String [] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/pvpit";
		String user = "root";
		String pass = "Sachin7588@*";
		String insert = "insert into tblEmployee values(2, 'omkar', 'beed',12345)";
		try {
			Class.forName(driver);
			Connection connection = DriverManager.getConnection(url, user, pass);
			Statement  st = connection.createStatement();
			st.executeUpdate(insert);
			System.out.println("Data inserted");
			System.out.println("MYSQL connected");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver class not found");
		}catch(SQLException e) {
			System.out.println("SQL exception");
		}
	}
}
