
public class StringIntro {
	
	public static void main (String args[])
	{
	String s = "i am good";				//[0,1,2,3,4]
	String s2 = "how are you"; 
	String s3 = "good";
	String s4  ="I am good";
	//length
	System.out.println(s.length());
	System.out.println(s.toUpperCase());
	System.out.println(s.toLowerCase());
	System.out.println(s.indexOf("good"));
	System.out.println(s.charAt(5));
//            string concatenation
	System.out.println(s +" "+ "how are you");
	System.out.println(s +" "+ s2);
	System.out.println(s.concat(" ").concat(s2));
	System.out.println(s.contains(s3));
	System.out.println(s.equals(s4));
	System.out.println(s.equalsIgnoreCase(s4));
	System.out.println(s.substring(5, 9));
	
	
	int a =10;
	int b =20;
	System.out.println(a+b);
	
	String c = "10";
	String d = "20";
	System.out.println(c+a);
	
	
	
	
	
	
	
	
	
	
	}

}
