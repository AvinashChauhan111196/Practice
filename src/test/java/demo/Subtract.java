package demo;

public class Subtract extends Sum {

      public int cal(int a,int b) {
		
		System.out.println("The sub of two num is "+(a-b));
		return a-b;	
	}
	
	public static void main(String[] args) {
		
		Subtract sub = new Subtract();
		sub.cal(20, 10);
		sub.cal(10, 20, 30);
	}

}
