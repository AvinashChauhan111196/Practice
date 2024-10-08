package core;

//Java program to demonstrate How Diamond Problem
//Is Handled in case of Default Methods

//Interface 1
interface GPI {

 // Default method
 default void show()
 {

     // Print statement
     System.out.println("Default GPI");
 }
}

//Interface 2
//Extending the above interface
interface P1 extends GPI {
}

//Interface 3
//Extending the above interface
interface P2 extends GPI {
}

//Main class
//Implementation class code
class Test implements P1, P2 {

 // Main driver method
 public static void main(String args[])
 {

     // Creating object of this class
     // in main() method
     Test d = new Test();

     // Now calling the function defined in interface 1
     // from whom Interface 2and 3 are deriving
     d.show();
 }
}