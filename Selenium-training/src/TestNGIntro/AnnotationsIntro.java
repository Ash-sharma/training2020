package TestNGIntro;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsIntro {
	
	@Test 
	public void testCase1() {
		System.out.println(" I am a test case ");
	}
	
	@Test
	public void testCase2() {
		System.out.println(" I am a test case 2 ");
	}
	
	@BeforeMethod
	public void bmethod() {
		System.out.println(" This will execute before every method");
	}
	
	@AfterMethod
	public void amethod() {
		System.out.println(" THis will be executed after every method ");
	}
	
	@BeforeClass
	public void bclass() {
		System.out.println("This will be executed before the class");
	}
	
	@AfterClass
	public void aclass() {
		System.out.println("This will be executed after the class");
	}
	
	@BeforeTest
	public void btest() {
		System.out.println("This will be executed before the test");
	}
	
	@AfterTest
	public void atest() {
		System.out.println("This will be executed after the Test");
	}
	
	@BeforeSuite
	public void bsuite() {
		System.out.println("This will be executed before the test suite");
	}
	
	@AfterSuite
	public void asuite(){
		System.out.println("This will be executed after the test suite ");
	}

}

/* Suite 
 * test
 * classes
 * methods
 * test method
 * 
 * Annotations - 
 * BeforeSuite
 * AfterSuite 
 * BeforeTest
 * AfterTest
 * BeforeClass
 * AfterClass
 * Beforemethod 
 * AfterMethod
 * BeforeGroup
 * AfterGroup
 */
