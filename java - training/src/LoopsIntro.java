
public class LoopsIntro {
	
	// while loop
		// while(condition is true)
//	{do something }
	public static void main (String args[]) {
	 int i;   // declareartion 
	 i= 6; // initialization
	 
	 int [] array = {1,2,3,4,5};
	 int [] array2 = {11,22,33,34,54,56};
//	 System.out.println(array2.length);
		
//		while(i < 5)
//	{
//		System.out.println("value of array at index " + i + " is " + array[i] );
//		i++;
//	}
		
		// do while loop
//		do{}while (condition is true)
		
//		do {
////			System.out.println("value of array at index " + i + " is " + array[i] );
//			System.out.println("Although condition is false i'll still run");
//			i++;
//		}
//		while(i < 5);
		
// for loop - for(variable initailization; boolean expression ; increment/decrement)
//				{ statement/ body }
//		for(int j = 0; j<array2.length; j++ )
//		{
//			System.out.println("value of array at index " + j + " is " + array2[j] );
//		}
		
//		for(int j= array.length-1; j>=0; j--)
//		{
//			

//	 nested for loops
	 
	 
//	 for (int x =0; x<5; x++)
//	 {
//		 for (int y =1; y<6;y++)
//		 {
//			 System.out.println("I am in inner for loop and value of y is " + y );
//		 }
//		System.out.println("I am in outer for loop and the value of x is " + x);
//		System.out.println("");
//		 
//	 }
	 
	 //sorting an array in ascending order
	 int array3[] = {10,5,3,6,7,1,4}; // {1,3,5,6,7} sorted 
	 
//	 for (int x = 0 ; x<=array3.length -1; x++) {
//		 for(int y = x+1;y<=array3.length-1; y++)
//		 {
//			 if(array3[x]>array3[y]) 
//			 {
//				 int temp = array3[x];
//				 array3[x] = array3[y];
//				 array3[y] = temp;
//				 }
//		 }
//		 System.out.println("new value of index is "+array3[x]);
//	 }
	 
	 
	 //  for each  for(datatype variablename : aarayname) {code}
	 String cars[] = {"BMW", "Merc", "Audi", "Porsche", "Ferrari"};
	 
//	 for(String x: cars) {
//		 System.out.println(x);
//	 }
	 
	 // break  - exist the loop
//	 for (int c= 0;c<5; c++) {
//		 if(c==2) {
//			 break;
//		 }
//		 System.out.println(c);
//	 }
//	 
	 // continue 
	 for (int c= 0;c<5; c++) {
		 if(c==2) {
			 continue; 
		 }
		 System.out.println(c);
	 }
	 
	
	
	
	}

}
