package TestNGIntro;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderIntro {
	
	@DataProvider(name = "new-Data")
	public Object[][] methoda(){
		return new Object[][] {{"first value"}, {"second value"}, {"hi i am third"}};
	}
	
	@DataProvider(name = "newDataSet")
	public Object[][] methodb(){
		return new Object [][] {{"valid email", "valid password"}
								,{"invalid email", "invalid pass"}
								,{"valid email", "invalid pass"}};
	}
	@DataProvider(name = "newDataSet1")
	public Object[][] methodc(){
		return new Object [][] {{"valid email", "valid password", "hit submit"}
								,{"invalid email", "invalid pass", "hit submit"}
								,{"valid email", "invalid pass", "hit submit"}};
	}
	
//	@Test(dataProvider = "new-Data" )
//	public void method1(String s) {
//		System.out.println(s);
//	}
	
//	@Test(dataProvider = "newDataSet" )
//	public void method2(String s, String s1) {
//		System.out.println(s +  " - " + s1);
//	}
	@Test(dataProvider = "newDataSet1" )
	public void method3(String s, String s1, String s2) {
		System.out.println(s +  " - " + s1 + s2);
	}
	
	

}
/*two ways to input data in test
 * 1. @parameters
 * 2.  @DataProvider annotation
 * */
