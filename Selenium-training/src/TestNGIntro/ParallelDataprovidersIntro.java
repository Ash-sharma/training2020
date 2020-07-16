package TestNGIntro;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParallelDataprovidersIntro {
@DataProvider(name = "address")
public Object[][] method1(){
	return new Object[][] {
		new	Object[]{1},
		new	Object[]{2},
		new	Object[]{3},
		new	Object[]{4},
		new	Object[]{5},
		new	Object[]{6},
		new	Object[]{7},
		new	Object[]{8},
		new	Object[]{9},
		new	Object[]{10},
		new	Object[]{11},
		};
	}

@Test(dataProvider ="address")
public void testCase1(int number) {
	System.out.println(number + "  " + Thread.currentThread().getId());
}

}
