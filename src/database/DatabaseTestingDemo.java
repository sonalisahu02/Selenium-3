package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatabaseTestingDemo {
	 static Connection conn=null;
	 private static Statement stmt;

	public static String  DB_URL="jdbc:mysql://localhost:3306/mysql";
	public static String  DB_USER="root";
	public static String DB_PASSWORD="Nandu@2018";
	
		@BeforeTest
		public static void setUp()
		{
		
			try {
				String dbClass="com.mysql.cj.jdbc.Driver";
					Class.forName(dbClass).newInstance();
				Connection conn=DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
				stmt= conn.createStatement();
			}
				catch(Exception e) {
					
					e.printStackTrace();
					
				}
			}
			
					@Test
					public void test() {
						try {
							
		   String query ="Select * from Employees";
		   ResultSet rs=stmt.executeQuery(query);
		  
				
			
				while(rs.next()){ 
					System.out.println(rs.getString(1));
					System.out.println("\t" +rs.getString(2));
					System.out.println("\t" +rs.getString(3));
					System.out.println("\t" +rs.getString(4));
				}
						}
				catch(Exception e)
				{
					e.printStackTrace();
				}
					}
					@AfterTest
					public void tearDown() throws SQLException {
						
					if(conn!=null)
						conn.close();
					
					

			

				
			}
				
			
				
				
				
				
			
		
		
	}

	


