package TestNGIntro;

import org.testng.annotations.Test;

public class GroupsIntro {
	// to tag these TC to groups
	@Test (groups = {"a"})
	public void testCase1() {
		System.out.println(" I am a test case 1");
	}
	
	@Test (groups = {"b"})
	public void testCase2() {
		System.out.println(" I am a test case 2 ");
	}
	@Test (groups = {"a"})
	public void testCase3() {
		System.out.println(" I am a test case 3 ");
	}
	
	@Test (groups = {"b"})
	public void testCase4() {
		System.out.println(" I am a test case 4 ");
	}
}

/*A method having two groups one icluded and other excluded from then that method 
 * will not run because pirority is given to exclude tag
 * */

