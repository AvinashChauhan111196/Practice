package demo;

public abstract class Vehicle {

	public abstract void travel();
	
	public abstract void transport();
	
	public void race() {
		
		System.out.println("Vehicle is used in racing");
	}
	
	public static void sport() {
		
		System.out.println("Vehicle is used in sports");
	}
}
