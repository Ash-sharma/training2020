package TestNGIntro;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelExecutionIntro {

	@BeforeMethod (enabled = false)
	public void method1() {
		System.out.println("Executing before test method");
	}
	
	@Test (enabled = false)
	public void test1() {
		System.out.println("Hi I am test 1");
	}
	
	@Test (enabled = false)
	public void test2() {
		System.out.println("hi I am test 2");
	}
	
	@Test
	public void test3() {
		for(int i = 1; i<= 10; i++) {
			System.out.println(i);
		}
	}
	@Test
	public void test4() {
		for(int i = 100; i< 110; i++) {
			System.out.println(i);
		}
	}
	
	@AfterMethod (enabled = false)
	public void method2() {
		System.out.println("Executing after test method");
	}
	
}
