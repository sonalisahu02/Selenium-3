package hybridFreamework;

import java.lang.reflect.Method;

import org.openqa.selenium.interactions.Actions;

public class DriverScript {
	public static Action actionkeywords;
	public static String sActions;
	public static Method method[];
	

public static void main(String[] args) throws Exception {
	
	String sPath=  "C:\\Work\\MethodList.xlsx"; 
	ReadExcel.setExcelFile(sPath,"Sheet1");
	for(int iRow=1;iRow<=7;iRow++)
	{
		sActions= ReadExcel.getCellData(iRow,2);
		execute_Actions();
		
	}
}
public static void execute_Actions() throws Exception {
	
	
	 actionkeywords= new Action();
	method = actionkeywords.getClass().getMethods();
	for(int i=0;i<method.length;i++)
	{
		if(method[i].getName().equals(sActions));
		{
			method[i].invoke(actionkeywords);
			break;
			
		}
	}
}
  
	
	
	
}
	
	

