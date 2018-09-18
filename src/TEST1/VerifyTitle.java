package TEST1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitle 
{
	@Test
	public void verify()
	{
		WebDriver driver= new FirefoxDriver();
		driver.get("https://demo.actitime.com");
	    String actualTitle=driver.getTitle();
	    System.out.println(actualTitle);
	    String expectedTitle="actiTIME - Login";
	    
	    //Assert.assertEquals(actualTitle, expectedTitle);
	    //Assert.assertNotEquals(actualTitle, expectedTitle);
	   // Assert.assertSame(actualTitle, expectedTitle);
	    Assert.assertNotSame(actualTitle, expectedTitle);
	}

}
