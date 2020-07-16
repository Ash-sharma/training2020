
public class HW1 {
	
	public static void checkOddEven(int a) {
		if (a%2 != 0)
		{
			System.out.println("number is odd");
		}
		
		else 
		{
			System.out.println("number is even");
		}
		
	}
	
	
	public static void switchMethod(char key) {
		
		switch (key)
		{
		case '0': System.out.println("You pressed 0."); break;
		case '1': System.out.println("You pressed 1."); break;
		case '2': System.out.println("You pressed 2."); break;
		case '3': System.out.println("You pressed 3."); break;
		case '4': System.out.println("You pressed 4."); break;
		case '5': System.out.println("You pressed 5."); break;
		case '6': System.out.println("You pressed 6."); break;
		case '7': System.out.println("You pressed 7."); break;
		case '8': System.out.println("You pressed 8."); break;
		case '9': System.out.println("You pressed 9."); break;
		default: System.out.println("Not allowed!"); break;
	}
	
	}
	public static void main (String args[])
	{  
		checkOddEven(15);
		switchMethod('5');
		
		
		
		{
			  
//			for(int Count = 0;Count<=5;Count++){ 
//				 if(Count==3){
//				 continue; 
//				 }
//				 System.out.println("Count is ==> " + Count);
//				 }
//				 
//				 // This will just print -- 3
//				 System.out.println("<==== Next Count ====>");
//				 for(int Count = 0;Count<=5;Count++){
//				 if(Count==3){
//				 System.out.println("Count is ==> " + Count);
//				 continue; 
//				 }
//				 System.out.println("I am out");
//				 }


}
}
}
