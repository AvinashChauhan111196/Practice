package prac;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int rem,temp,num = 1234;
		int sum = 0;
		temp = num;
		
		while(num>0)
		{
			rem = num%10;
			sum = sum*10 + rem;
			num = num/10;
		}
		
		System.out.println("The reverse of number is " +sum);
	}
}
