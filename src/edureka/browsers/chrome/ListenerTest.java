package edureka.browsers.chrome;

import javax.naming.spi.DirStateFactory.Result;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener {
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		 System.out.println(result.getName());
			}

	

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
      System.out.println("The name of the testcase failed is :" + result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		 System.out.println("The name of the testcase skipped is :" + result.getName());
			
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		 //System.out.println(context.getName());
			}

	


	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

}
