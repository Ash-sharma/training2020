package TestNGIntro;

import org.testng.annotations.Test;

public class IgnoreTestsIntro {
	
	@Test (enabled = false)
	public void methodA() {
		System.out.println("Hi i am in method A");
	}
	
	@Test (groups = {"a"})
	public void methodB() {
		System.out.println("Hi i am in method B");
	}
	
	@Test (groups = {"b"})
	public void methodC() {
		System.out.println("Hi i am in method C");
	}

}
