package TEST1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount 
{
	@Test(invocationCount=3 ,priority=-7)
	public void saswat()
	{
		Reporter.log("saswat", true);
	}
	
	@Test(invocationCount=2 ,priority=3)
	public void milan()
	{
		Reporter.log("milan", true);
	}
	@Test(invocationCount=1 ,priority=0)	
	public void ajit()
	{
		Reporter.log("ajit", true);
	}
	@Test(priority=-2)
	public void junaid()
	{
		Reporter.log("junaid", true);
	}

}
