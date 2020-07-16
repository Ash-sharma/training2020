package TestNGIntro;

import org.testng.annotations.Test;

public class DependentTestIntro {
	
	@Test (dependsOnMethods = {"testCase2", "testCase4"})
	public void testCase1() {
		System.out.println(" I am a test case 1");
	}
	
	@Test (dependsOnGroups = {"a", "b"})
	public void testCase2() {
		System.out.println(" I am a test case 2 ");
	}
	@Test (groups = {"a"})
	public void testCase3() {
		System.out.println(" I am a test case 3 ");
	}
	
	@Test 
	public void testCase4() {
		System.out.println(" I am a test case 4 ");
	}
	
	@Test (groups = {"b"})
	public void testCase5() {
		System.out.println(" I am a test case 5 ");
	}
}
