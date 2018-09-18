package TEST1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MultipleTestMethod
{
	@Test
	public void saswat()
	{
		Reporter.log("saswat", true);
	}
	
	@Test
	public void milan()
	{
		Reporter.log("milan", false);
	}
	@Test		
	public void ajit()
	{
		Reporter.log("ajit", true);
	}
	@Test
	public void junaid()
	{
		Reporter.log("junaid", true);
	}

}
