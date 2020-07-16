package TestNGIntro;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test (priority = 1)	
public void method1() {
		System.out.println("Hi");
	}
	
	@Test (priority = 3)
	@Parameters({"n1", "n2"})
	public void add(int a, int b) {
		System.out.println("Adding two numbers" + a+b);
	}
	
	@Test (priority =2)
	public void back() {
		System.out.println("Going back");
	}

}
