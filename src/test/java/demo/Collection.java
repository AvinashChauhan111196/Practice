package demo;

import java.util.*;

public class Collection {

	
//	static Set<String> arrList = new HashSet<>();
//	static Set<String> arrList = new LinkedHashSet<>();
//	static Set<String> arrList = new TreeSet<>();
//	static SortedSet<String> arrList = new TreeSet<>();
	static NavigableSet<Integer> arrList = new TreeSet<>();
//	static Set<String> arrList = new HashSet<>();
//	static Set<String> arrList = new LinkedHashSet<>();
//	static List<String> arrList = new ArrayList();
	
	public static void main(String[] args) {
		
		
//		ArrayList is doubly list
//		arrList.add("Ravi");
//		arrList.add("Vijay");  
//		arrList.add("Ravi");  
//		arrList.add("Ajay");  

//		HashSet ignoring duplicate values
//		arrList.add("Ravi");  
//		arrList.add("Vijay");  
//		arrList.add("Ravi");  
//		arrList.add("Ajay");  
		  
//		LinkedHashSet will not add A as it is already present
//		arrList.add("A");
//		arrList.add("B");
//		arrList.add("C");
//		arrList.add("D");
//		arrList.add("A");
		
		
		
//		System.out.println(arrList);
		
		
////		TreeSet Sorted
//		arrList.add("A");  
//		arrList.add("B");  
//         arrList.add("C");  
//         arrList.add("D");  
//         arrList.add("E");  
////           
//         System.out.println("Intial Set: "+arrList);  
//           
//         System.out.println("Head Set: "+arrList.headSet("C"));  
//          
//         System.out.println("SubSet: "+arrList.subSet("B", "E"));  
//           
//         System.out.println("TailSet: "+arrList.tailSet("C"));  
		
		
//		NavigableSet
		  	arrList.add(0);
	        arrList.add(1);
	        arrList.add(2);
	        arrList.add(3);
	        arrList.add(4);
	        arrList.add(5);
	        arrList.add(6);
	        
	     // Get a reverse view of the navigable set
	        NavigableSet<Integer> reversearrList = arrList.descendingSet();
	 
	        // Print the normal and reverse views
	        System.out.println("Normal order: " + arrList);
	        System.out.println("Reverse order: " + reversearrList);
	 
	        NavigableSet<Integer> threeOrMore = arrList.tailSet(3, true);
	        System.out.println("3 or  more:  " + threeOrMore);
	        System.out.println("lower(3): " + arrList.lower(3));
	        System.out.println("floor(3): " + arrList.floor(3));
	        System.out.println("higher(3): " + arrList.higher(3));
	        System.out.println("ceiling(3): " + arrList.ceiling(3));
	 
	        System.out.println("pollFirst(): " + arrList.pollFirst());
	        System.out.println("Navigable Set:  " + arrList);
	 
	        System.out.println("pollLast(): " + arrList.pollLast());
	        System.out.println("Navigable Set:  " + arrList);
	 
	        System.out.println("pollFirst(): " + arrList.pollFirst());
	        System.out.println("Navigable Set:  " + arrList);
	 
	        System.out.println("pollFirst(): " + arrList.pollFirst());
	        System.out.println("Navigable Set:  " + arrList);
	 
	        System.out.println("pollFirst(): " + arrList.pollFirst());
	        System.out.println("Navigable Set:  " + arrList);
	 
	        System.out.println("pollFirst(): " + arrList.pollFirst());
	        System.out.println("pollLast(): " + arrList.pollLast());
	}

}
