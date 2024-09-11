package string;

public class RemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "   j  a va s t a r  ";
	//  String trimmed with white space before and after is removed
	//	String trimStr = str.trim();
		
		String str1 = str.replaceAll("\\s", "");
		
		System.out.println(str1);
	}

}
