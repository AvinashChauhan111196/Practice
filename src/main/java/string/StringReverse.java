package string;

/* 	Using toCharArray() method
	Using charAt(int index) method
	Using java.lang.StringBuffer class provided reverse() method
	Using java.lang.StringBuilder class provided reverse() method

*/
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "avinash";
		
		//Approach 1
		char ch[] = str.toCharArray();
		for(int i = ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		
		System.out.println("");
		
		//Approach 2
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
		
		System.out.println("");
		
		//Approach 3
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
		//Approach 4
		StringBuilder sbb = new StringBuilder(str);
		System.out.println(sbb.reverse());
	}

}
