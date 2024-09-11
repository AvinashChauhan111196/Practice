package core;

public class This { 
	  int x; 
	  int y;
	  int z;
	 
	  // Constructor with a parameter
	  public This(int x) { 
	    this.x = x; 
	  } 
	  
	  public This(int y,int z) {
		  this.y = y;
		  this.z = z;
	  }

	  // Call the constructor
	  public static void main(String[] args)  { 
	    This myObj = new This(10); 
	    This myObj2 = new This(20);
	    This myObj3 = new This(10,20);
	    System.out.println("Value of x = " + myObj.x);
	    System.out.println("Value of x from obj2 is " +myObj2.x);
	    System.out.println("Value of y and z from obj3 is " +myObj3.y +" " +myObj3.z);
	  } 
	} 