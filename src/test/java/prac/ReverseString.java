package prac;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "abcd";
		String reverse = "";
		char ch;
		
		for(int i=0;i<str.length();i++)
		{
			ch = str.charAt(i);
			reverse = ch + reverse ;
		}
		
		System.out.println("The reverse is " +reverse);
	}
}
