package fr.fms.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import fr.fms.bdd.CreateConfigFile;

public class Bddconnection 
{
	static Connection getConnection() 
	{
		Properties prp = null;
		try 
		{
			prp = CreateConfigFile.readFile("configtext.txt");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		try 
		{
			Class.forName(prp.getProperty("db.driver.class"));
			Connection connection;
			try {
				connection = DriverManager.getConnection(prp.getProperty("db.url") , prp.getProperty("db.login") , prp.getProperty("db.password"));
				return connection;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		return null;
	}
}
