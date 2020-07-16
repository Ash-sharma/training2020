
public class Home {
	
	int i =10;             // instance varaible
	int j = 10;
	
	static 

	
	public void paintRedColor()  // state1
	{
		int i =100; //local
		System.out.println(i);
		int a =90;      //local varaiable 
		System.out.println(a);
		System.out.println("house is printed red");
	}
	
	public void doorForHouse() {
		System.out.println(i);
//		System.out.println(a);
		System.out.println("install 3 doors");
	}
	
	public void installwindow()
	{
		System.out.println("install just 1 window");
	}
	
	public static void main (String args[]) //main method
	{
		Home house1 = new Home();  //object house1
		house1.paintRedColor();
		house1.doorForHouse();
		house1.installwindow();
		
//		Home house2 = new Home(); // new object home which is called house 2
//		house2.doorForHouse();
//		house2.paintRedColor();
//		house2.installwindow();
//		 Home house3  =new Home();
		 
		 System.out.println(house1.i);
	}

}
