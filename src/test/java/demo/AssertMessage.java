package demo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertMessage {

	@Test
	public void test1() {
		
		SoftAssert sf = new SoftAssert();
		sf.assertNotEquals("abc", "acc");
		sf.assertNotEquals(1, 2);
		sf.assertNotEquals(1.2, 2.1);
		sf.assertNotEquals('a', 'c');
		sf.assertNotEquals("abc", "abc", "The values are matching");
		sf.assertNotEquals('a','b');
		sf.assertTrue(false, "The output is wrong");
		sf.assertNull(null, "The output is wrong");
		sf.assertNotEquals(3,3,"The values are matching");
			
	}
	
	@Test
	public void test2() {
		
		Assert.assertNotEquals('a','b');
		Assert.assertNotEquals(false,true);
		Assert.assertNotEquals(1,2);
		Assert.assertNotEquals(1.2,2.1);
		Assert.assertNotEquals("avi","avinash");
		Assert.assertNotEquals("avi","avi","The values are matching");
		Assert.assertNotEquals('a','b');
		Assert.assertTrue(false, "The output is wrong");
		Assert.assertNull(null, "The output is wrong");
		Assert.assertNotEquals(3,3,"The values are matching");
		Assert.assertNotSame("abc","acb", "The values are matching");
	}
	
}
