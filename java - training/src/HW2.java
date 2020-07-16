
public class HW2 {
	
	public static void main (String args[]) {
		
		int i, j, k, l;
//		//1
//	    for (i = 1; i <= 4; i++)
//	    {
//	        for (j = 1; j <= 10; j++)
//	        {
//	            System.out.print("*");
//	        }
//	        System.out.println();
//	    }
//	    //2
//	    for (i = 1; i <= 5; i++)
//	    {
//	        for (j = 1; j <= i; j++)
//	        {
//	            System.out.print("*");
//	        }
//	        System.out.println();;
//	    }
	
  //3
//	    for (i = 1; i <= 5; i++)
//	    {
//	        for (j = 5; j > i; j--)
//	        {
//	            System.out.print(" ");
//	        }
//	        for (k = 1; k <= i; k++)
//	        {
//	            System.out.print("*");
//	        }
//	        System.out.println();
//	    }
	    
	    for (i = 1; i <= 5; i++)
	    {
	    	System.out.println("value of i " + i);
	        for (j = 5; j > i; j--)
	        {
	        	System.out.println("value of j " + j);
	            System.out.print(" ");
	        }
	        for (k = 1; k <= i; k++)
	        {
	        	System.out.println("value of k "+ k);
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	    
//	    //4
//	    for (i = 1; i <= 5; i++)
//	    {
//	        for (j = 5; j > i; j--)
//	        {
//	        	System.out.print(" ");
//	        }
//	        for (k = 1; k <= 2 * i - 1; k++)
//	        {
//	        	System.out.print("*");
//	        }
//	        System.out.println();
//	    }
//	    
//	    //5
//	    for (i = 1; i <= 5; i++)
//	    {
//	        for (j = 5; j > i; j--)
//	        {
//	        	System.out.print(" ");
//	        }
//	        for (k = 1; k <= 2 * i - 1; k++)
//	        {
//	        	System.out.print(i);
//	        }
//	        System.out.println();
//	    }
//	    
//	    //6
//	    for (i = 1; i <= 5; i++)
//	    {
//	        for (j = 5; j > i; j--)
//	        {
//	        	System.out.print(" ");
//	        }
//	        for (k = i; k >= 1; k--)
//	        {
//	        	System.out.print(k);
//	        }
//	        for (l = 2; l <= i; l++)
//	        {
//	        	System.out.print(l);
//	        }
//	        System.out.println();
//	    }
//	   
//	    // fibonnaci
//	    int n = 10, t1 = 0, t2 = 1;
//        System.out.print("First " + n + " terms: ");
//
//        for (i = 1; i <= n; ++i)
//        {
//            System.out.print(t1 + " ");
//
//            int sum = t1 + t2;
//            t1 = t2;
//            t2 = sum;
//        }
//	    
	    
	}

}
