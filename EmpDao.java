package com.cestar.dao;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class EmpDao {
	
	public Connection getConnection(){
		
		String url = "jdbc:mysql://localhost:3306/test";
		String user = "root";
		String pwd = "";
		
		Connection con = null;
		
				
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url,user,pwd);
			
			System.out.println("it is okay");
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
		
		
	}

}
