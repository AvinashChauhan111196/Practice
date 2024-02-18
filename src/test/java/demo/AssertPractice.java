package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AssertPractice {
	
	WebDriver driver = new ChromeDriver();

	public void softAssert() {
		
		SoftAssert sf = new SoftAssert();
		sf.assertNotEquals("abc", "acc");
		sf.assertEquals('a','b');
		sf.assertTrue(true);
		sf.assertFalse(false);
		sf.assertSame(sf, sf);
		sf.assertNotSame(driver, sf);
		
		
	}
	
	public void hardAssert() {
		
		Assert.assertEquals('a', 'a');
		Assert.assertNotEquals('a', 'b');
		Assert.assertTrue(true);
		Assert.assertFalse(false);
		Assert.assertEquals("adf", "adf");
		Assert.assertNotEquals("adf", "amf");
	}
	
}
