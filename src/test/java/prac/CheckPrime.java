package prac;

public class CheckPrime {

	public static void main(String[] args)
	   {
	      int num=7, i, count=0;
	      	      
	   
	      
	      for(i=2; i<num; i++)
	      {
	         if(num%i == 0)
	         {
	            count++;
	            break;
	         }
	      }
	      
	      if(count==0)
	         System.out.println("\nIt is a Prime Number." +num);
	      else
	         System.out.println("\nIt is not a Prime Number.");
	   }
}
