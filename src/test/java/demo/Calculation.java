package demo;

public class Calculation implements PracInterface {

	int a = 10;
	int b = 5;
	int cal;
	
	public void mult() {
		
		cal = a*b;
		System.out.println("Multiplication of number is " +cal);
	}

	public void div() {
		
		cal = a/b;
		System.out.println("Division of number is " +cal);
	}

	public void sub() {
		
		cal = a-b;
		System.out.println("Subtraction of number is " +cal);
	}

	public void add() {
	
		cal = a+b;
		System.out.println("Addition of number is " +cal);
	}
	
	
	
	public static void main(String[] args) {
		
		Calculation c = new Calculation();
		c.mult();
		c.div();
		c.sub();
		c.add();
		c.xxx();

	}

	@Override
	public void xxx() {
		// TODO Auto-generated method stub
		
	}

	

}
