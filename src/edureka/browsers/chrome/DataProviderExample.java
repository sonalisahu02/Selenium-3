package edureka.browsers.chrome;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	
	@Test(dataProvider="getData")
	public void setData(String username,String password)
	{
		System.out.println("your user name is::" +username);
		System.out.println("your password is::" +password);
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[3][2];
		  //1s row
		 data[0][0]= "user1";
		 data[0][1]= "abcjdj";
		 
		 data[1][0]= "user2";
		 data[1][1]= "abcdef";
		 
		 data[2][0]= "user3";
		 data[2][1]= "abcxyz";
		 
		 return data;
	}
		 
		 
		
	}


