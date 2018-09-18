package TEST1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority 
{
	@Test(priority=-7)
	public void saswat()
	{
		Reporter.log("saswat", true);
	}
	
	@Test(priority=3)
	public void milan()
	{
		Reporter.log("milan", true);
	}
	@Test(priority=0)	
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
