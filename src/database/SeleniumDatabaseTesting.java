package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// import com.mysql.cj.xdevapi.Statement;

public class SeleniumDatabaseTesting {
	static final String JDBC_DRIVER="com.mysql.jdbc.Driver";//C:\Work\Java\Framework\Jdbc Mysql
	static final String  DB_URL="jdbc:mysql://localhost:3306/mysql";
	//database credentials
	static final String USER="root";
	static final String PASS="Nandu@2018";
	
	public static void main(String[] args)
	{
		Connection conn=null;
		Statement stmt=null;
		
		try {
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
			System.out.println("connecting to database...");
			conn=DriverManager.getConnection(DB_URL,"root","Nandu@2018");
			System.out.println("Creating Statement...");
			stmt= conn.createStatement();
			String sql;
			sql = "SELECT empid,age,FirstName,LastName FROM Employees";
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()) {
				int empid=rs.getInt("empid");
				int age = rs.getInt("age");
				String FirstName=rs.getString("FirstName");
				String LastName=rs.getString("LastName");
				
				System.out.println("ID:" +empid);
				System.out.println(" , Age:" +age);
		
				System.out.println("FirstName:" + FirstName );
				System.out.println(" ,LastName:"+ LastName);				
			}
			rs.close();
			stmt.close();
			conn.close();
			
		}catch(SQLException se) {
			se.printStackTrace();
			
		}
			
			
			
			
		
	}
	
}
