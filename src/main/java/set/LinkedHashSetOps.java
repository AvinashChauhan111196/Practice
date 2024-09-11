package set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetOps {

//	Insert Elements to LinkedHashSet
//	add() - inserts the specified element to the linked hash set
//	addAll() - inserts all the elements of the specified collection to the linked hash set
	
//	public static void main(String[] args) {
//        LinkedHashSet<Integer> evenNumber = new LinkedHashSet<>();
//
//        // Using add() method
//        evenNumber.add(2);
//        evenNumber.add(4);
//        evenNumber.add(6);
//        System.out.println("LinkedHashSet: " + evenNumber);
//
//        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
//        
//        // Using addAll() method
//        numbers.addAll(evenNumber);
//        numbers.add(5);
//        System.out.println("New LinkedHashSet: " + numbers);
//    }
	
//	Access LinkedHashSet Elements
//	To access the elements of a linked hash set, we can use the iterator()method. 
//	In order to use this method, we must import the java.util.Iterator package. For example,
	
//	 public static void main(String[] args) {
//	        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
//	        numbers.add(2);
//	        numbers.add(5);
//	        numbers.add(6);
//	        System.out.println("LinkedHashSet: " + numbers);
//
//	        // Calling the iterator() method
//	        Iterator<Integer> iterate = numbers.iterator();
//
//	        System.out.print("LinkedHashSet using Iterator: ");
//
//	        // Accessing elements
//	        while(iterate.hasNext()) {
//	            System.out.print(iterate.next());
//	            System.out.print(", ");
//	        }
//	    }
	 
//	 Remove Elements from HashSet
//	 remove() - removes the specified element from the linked hash set
//	 removeAll() - removes all the elements from the linked hash set
	 
//	 public static void main(String[] args) {
//	        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
//	        numbers.add(2);
//	        numbers.add(5);
//	        numbers.add(6);
//	        System.out.println("LinkedHashSet: " + numbers);
//
//	        // Using the remove() method
//	        boolean value1 = numbers.remove(5);
//	        System.out.println("Is 5 removed? " + value1);
//
//	        boolean value2 = numbers.removeAll(numbers);
//	        System.out.println("Are all elements removed? " + value2);
//	    }
	 
//	 Set Operations
//	 The various methods of the LinkedHashSet class can also be used to perform various set operations.
	 
//	 Union of Sets
//	 Two perform the union between two sets, we can use the addAll() method. For example,
	 
//	 public static void main(String[] args) {
//	        LinkedHashSet<Integer> evenNumbers = new LinkedHashSet<>();
//	        evenNumbers.add(2);
//	        evenNumbers.add(4);
//	        System.out.println("LinkedHashSet1: " + evenNumbers);
//
//	        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
//	        numbers.add(1);
//	        numbers.add(3);
//	        System.out.println("LinkedHashSet2: " + numbers);
//
//	        // Union of two set
//	        numbers.addAll(evenNumbers);
//	        System.out.println("Union is: " + numbers);
//	    }
	 
//	 Intersection of Sets
//	 To perform the intersection between two sets, we can use the retainAll() method. For example
	 
//	 public static void main(String[] args) {
//	        LinkedHashSet<Integer> primeNumbers = new LinkedHashSet<>();
//	        primeNumbers.add(2);
//	        primeNumbers.add(3);
//	        System.out.println("LinkedHashSet1: " + primeNumbers);
//
//	        LinkedHashSet<Integer> evenNumbers = new LinkedHashSet<>();
//	        evenNumbers.add(2);
//	        evenNumbers.add(4);
//	        System.out.println("LinkedHashSet2: " + evenNumbers);
//
//	        // Intersection of two sets
//	        evenNumbers.retainAll(primeNumbers);
//	        System.out.println("Intersection is: " + evenNumbers);
//	    }
	
//	Difference of Sets
//	To calculate the difference between the two sets, we can use the removeAll() method. For example,
	
//	public static void main(String[] args) {
//        LinkedHashSet<Integer> primeNumbers = new LinkedHashSet<>();
//        primeNumbers.add(2);
//        primeNumbers.add(3);
//        primeNumbers.add(5);
//        System.out.println("LinkedHashSet1: " + primeNumbers);
//
//        LinkedHashSet<Integer> oddNumbers = new LinkedHashSet<>();
//        oddNumbers.add(1);
//        oddNumbers.add(3);
//        oddNumbers.add(5);
//        System.out.println("LinkedHashSet2: " + oddNumbers);
//
//        // Difference between LinkedHashSet1 and LinkedHashSet2
//        primeNumbers.removeAll(oddNumbers);
//        System.out.println("Difference : " + primeNumbers);
//    }
	
//	Subset
//	To check if a set is a subset of another set or not, we can use the containsAll() method. For example,
	
	public static void main(String[] args) {
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("LinkedHashSet1: " + numbers);

        LinkedHashSet<Integer> primeNumbers = new LinkedHashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        System.out.println("LinkedHashSet2: " + primeNumbers);

        // Check if primeNumbers is a subset of numbers
        boolean result = numbers.containsAll(primeNumbers);
        System.out.println("Is LinkedHashSet2 is subset of LinkedHashSet1? " + result);
    }
}
