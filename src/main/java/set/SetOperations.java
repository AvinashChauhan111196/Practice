package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Operations on the Set Interface
//The set interface allows the users to perform the basic mathematical operation on the set. Let’s take two arrays to understand these basic operations. Let set1 = [1, 3, 2, 4, 8, 9, 0] and set2 = [1, 3, 7, 5, 4, 0, 7, 5]. Then the possible operations on the sets are:
//
//1. Intersection: This operation returns all the common elements from the given two sets. For the above two sets, the intersection would be:
//
//Intersection = [0, 1, 3, 4] 
//2. Union: This operation adds all the elements in one set with the other. For the above two sets, the union would be: 
//
//Union = [0, 1, 2, 3, 4, 5, 7, 8, 9] 
//3. Difference: This operation removes all the values present in one set from the other set. For the above two sets, the difference would be: 
//
//Difference = [2, 8, 9]


public class SetOperations {

	
	// Main driver method 
    public static void main(String args[])
    {
        // Creating an object of Set class 
        // Declaring object of Integer type 
        Set<Integer> a = new HashSet<Integer>();
      
        // Adding all elements to List 
        a.addAll(Arrays.asList(
            new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));
      
      // Again declaring object of Set class
      // with reference to HashSet
        Set<Integer> b = new HashSet<Integer>();
        
      b.addAll(Arrays.asList(
            new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));

        
        // To find union
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.print("Union of the two Set");
        System.out.println(union);

        // To find intersection
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.print("Intersection of the two Set");
        System.out.println(intersection);

        // To find the symmetric difference
        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.print("Difference of the two Set");
        System.out.println(difference);
    }
}
