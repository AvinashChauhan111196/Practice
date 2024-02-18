package prac;

public class PallindromeString {

	public static void main(String[] args) {
		
		String str = "boab";
		String rstr = "";
		
		
		
		for(int i = str.length()-1;i>=0;i--)
		{
			rstr = rstr + str.charAt(i);
		}
		if(str.equals(rstr)) {
			System.out.println("The word is pallindrome");
		}
		else
		{
			System.out.println("The word is not pallindrome");
		}
	}
}
