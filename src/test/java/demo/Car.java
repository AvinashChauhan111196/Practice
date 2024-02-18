package demo;

public class Car extends Vehicle {

	@Override
	public void travel() {
		
		System.out.println("Car is used for travelling");
	}

	@Override
	public void transport() {
		
		System.out.println("Car is used for transport");
	}
	
	public void race() {
		
		System.out.println("Car is used for racing");
	}
	
	public static void main(String args[])
	{
		Car c = new Car();
		c.travel();
		c.transport();
		c.race();
		Vehicle.sport();
		
	}

}
