package com.qbtrance.djrank.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.qbtrance.dj_rank.domain.Dj;

public class JDBCConnector {

	public static void main(String[] args) {

		System.out.println("-------- MySQL JDBC - Initializing JDBCConnector for djrank ------------");
		
		JDBCConnector jdbcConnector = new JDBCConnector();
		jdbcConnector.printAllDjList();

//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			System.out.println("Where is your MySQL JDBC Driver?");
//			e.printStackTrace();
//			return;
//		}
//
//		System.out.println("MySQL JDBC Driver Registered and ready to work.");
//		Connection connection = null;
//
//		try {
//			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/djrank", "root", "admin");
//			Statement stmt = connection.createStatement();
//			ResultSet rs = stmt.executeQuery("SELECT * from dj");
//
//			while (rs.next()) {
//				int id = rs.getInt("id");
//				String first = rs.getString("fName");
//				String last = rs.getString("lName");
//				System.out.println(first);
//			}
//
//		} catch (SQLException e) {
//			System.out.println("Connection Failed! Check output console");
//			e.printStackTrace();
//			return;
//		}
	}

	public Connection getConnection() 
	{
		Connection connection = null;

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/djrank", "root", "admin");
			
		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
		}
		
		return connection;
	}
	
	
	public ResultSet getAllDjList(Connection connection) 
	{
		Statement stmt=null;
		ResultSet rs=null;
		
		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery("SELECT * from dj");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rs;
	}
	
	
	public void printAllDjList() 
	{
		Connection conn = getConnection();
		ResultSet rs = getAllDjList(conn);
		
		System.out.println("Printing all Dj list: ");
		
		try {
			while (rs.next()) {
				int id = rs.getInt("id");
				String first = rs.getString("fName");
				String last = rs.getString("lName");
				System.out.println(first);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		insertDj(new Dj(1, "a", "b", "c", "e", "f", "g"), conn);
	}
	
	
	public void insertDj(Dj dj, Connection connection) {
		
		String insertTableSQL = "INSERT INTO DJ"
				+ "(ID, FNAME, LNAME, DJNAME, WEBSITE, EMAIL, COUNTRY) VALUES"
				+ "(?,?,?,?,?,?,?)";
		
		try {
			
			PreparedStatement preparedStatement = connection.prepareStatement(insertTableSQL);
			preparedStatement.setInt(1, 10);
			preparedStatement.setString(2, "Ricardo");
			preparedStatement.setString(3, "Morales");
			preparedStatement.setString(4, "Ctrlz3ta");
			preparedStatement.setString(5, "Ctrlz3ta.com");
			preparedStatement.setString(6, "Ctrlz3ta@qbtrance.com");
			preparedStatement.setString(7, "MX");
			
			// execute insert SQL stetement
			preparedStatement .executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} 

}