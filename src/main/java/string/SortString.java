package string;

import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "rock";
		
		char arr[]= str.toCharArray();
		
		char temp;
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] > arr[j])
				{
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				}
			}
			
		}
		System.out.println(new String(str));
		
		//Approach 2
		String str2 = "jav";
		char[] arry = str2.toCharArray();
		Arrays.sort(arry);
		System.out.println(new String(arry));
		
}
}
