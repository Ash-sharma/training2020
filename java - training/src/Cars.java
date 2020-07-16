// classes they 3 things
// state - datatype of object   , 
// behaviour - represnets the functinality - drive, honk methods
// Identities - unique identity for the class

/*
 * fields  - varaibles
 * methods
 * constructors
 * blocks 
 * interfaces*/
public class Cars {
	
	int modelYear;
	String modelName;
	
	//contructors -  it is method to initialze the object of the class
	// it is called when am object of class is ceated
	// default contructor
//	Cars(){   
//		car1 = "BMW";
//	}
	
//	parameterized constructor
	Cars (int y, String x){
		modelYear = y;
		modelName = x;
	}
	
	public static void main (String []args) {
		Cars c = new Cars(2020 ,"Ferrari" );
		System.out.println(c.modelName + c.modelYear);
		Cars c1 = new Cars(2020 ,"Audi");
		System.out.println(c1.modelName + c1.modelYear);
		
	}
				
	
	
	
	
	
}
