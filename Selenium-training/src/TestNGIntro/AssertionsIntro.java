package TestNGIntro;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsIntro {
	
	@Test
	public void testCase1()
	{
		int i = 1;
		Assert.assertEquals(i, 2, "Both the are not equal");
	}
	
	@Test
	public void testCase2()
	{
		int i = 1;
		Assert.assertEquals(i, 1, "Both the are not equal");
	}
	

}
/* syntax of assert
 * Assert.method(actual,expected)
 * Hard assert  - stops the execution of hte test when the assert fails
 * Soft assertin - doesnot stop execution rather given all the failures at the end
*/
