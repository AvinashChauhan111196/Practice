package prac;

public class PrimeCount {

	 public static void main(String arg[]){
	      int i,n,counter, j;
	      n= 100;
	      System.out.printf("\nPrime numbers till %d are ", n);
	      for(j=2;j<=n;j++){
	         counter=0;
	         for(i=1;i<=j;i++){
	            if(j%i==0){
	               counter++;
	            }
	         }
	         if(counter==2)
	         System.out.print(j+" ");
	      }
	   }
}
