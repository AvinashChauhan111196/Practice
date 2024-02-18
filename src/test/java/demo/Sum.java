package demo;


public class Sum {

public int cal(int a,int b) {
		
		System.out.println("The sum of two num is "+(a+b));
		return a+b;	
	}
	
	public int cal(int a,int b,int c) {
		
		System.out.println("The sum of three num is "+(a+b+c));
		return a+b+c;
	}
	
	public static void main(String[] args) {
		
		Sum s = new Sum();
		s.cal(20, 10);
		s.cal(10, 20, 30);

	}

}
