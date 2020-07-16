package TestNGIntro;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersIntro {

@Test
@Parameters({"n1", "n2"})
public void add(int i, int j) {
	int sum = i+j;
	System.out.println(sum);
}
@Test
@Parameters({"n1", "n2"})
public void sub(int i, int j) {
	int sum = j-i;
	System.out.println(sum);
}

	
}
