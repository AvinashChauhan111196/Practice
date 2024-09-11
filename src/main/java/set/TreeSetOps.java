package set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetOps {

//	Insert Elements to TreeSet
//	add() - inserts the specified element to the set
//	addAll() - inserts all the elements of the specified collection to the set
	
//	public static void main(String[] args) {
//
//        TreeSet<Integer> evenNumbers = new TreeSet<>();
//
//        // Using the add() method
//        evenNumbers.add(2);
//        evenNumbers.add(4);
//        evenNumbers.add(6);
//        System.out.println("TreeSet: " + evenNumbers);
//
//        TreeSet<Integer> numbers = new TreeSet<>();
//        numbers.add(1);
//
//        // Using the addAll() method
//        numbers.addAll(evenNumbers);
//        System.out.println("New TreeSet: " + numbers);
//    }
	
//	Access TreeSet Elements
//	To access the elements of a tree set, we can use the iterator() method. In order to use this method, 
//	we must import java.util.Iterator package. For example,
	
//	public static void main(String[] args) {
//        TreeSet<Integer> numbers = new TreeSet<>();
//        numbers.add(2);
//        numbers.add(5);
//        numbers.add(6);
//        System.out.println("TreeSet: " + numbers);
//
//        // Calling iterator() method
//        Iterator<Integer> iterate = numbers.iterator();
//        System.out.print("TreeSet using Iterator: ");
//        // Accessing elements
//        while(iterate.hasNext()) {
//            System.out.print(iterate.next());
//            System.out.print(", ");
//        }
//    }
	
//	Remove Elements
//	remove() - removes the specified element from the set
//	removeAll() - removes all the elements from the set
	
//	public static void main(String[] args) {
//        TreeSet<Integer> numbers = new TreeSet<>();
//        numbers.add(2);
//        numbers.add(5);
//        numbers.add(6);
//        System.out.println("TreeSet: " + numbers);
//
//        // Using the remove() method
//        boolean value1 = numbers.remove(5);
//        System.out.println("Is 5 removed? " + value1);
//
//        // Using the removeAll() method
//        boolean value2 = numbers.removeAll(numbers);
//        System.out.println("Are all elements removed? " + value2);
//    }
	
	
//	Methods for Navigation
//	Since the TreeSet class implements NavigableSet, 
//	it provides various methods to navigate over the elements of the tree set.
//
//	1. first() and last() Methods
//	first() - returns the first element of the set
//	last() - returns the last element of the set
	
//	public static void main(String[] args) {
//        TreeSet<Integer> numbers = new TreeSet<>();
//        numbers.add(2);
//        numbers.add(5);
//        numbers.add(6);
//        System.out.println("TreeSet: " + numbers);
//
//        // Using the first() method
//        int first = numbers.first();
//        System.out.println("First Number: " + first);
//
//        // Using the last() method
//        int last = numbers.last();
//        System.out.println("Last Number: " + last);
//    }
	
//	2. ceiling(), floor(), higher() and lower() Methods
//	higher(element) - Returns the lowest element among those elements that are greater than the specified element.
//	lower(element) - Returns the greatest element among those elements that are less than the specified element.
//	ceiling(element) - Returns the lowest element among those elements that are greater than the specified element. 
//	If the element passed exists in a tree set, it returns the element passed as an argument.
//	floor(element) - Returns the greatest element among those elements that are less than the specified element. 
//	If the element passed exists in a tree set, it returns the element passed as an argument.
	
//	public static void main(String[] args) {
//        TreeSet<Integer> numbers = new TreeSet<>();
//        numbers.add(2);
//        numbers.add(5);
//        numbers.add(4);
//        numbers.add(6);
//        System.out.println("TreeSet: " + numbers);
//
//        // Using higher()
//        System.out.println("Using higher: " + numbers.higher(4));
//
//        // Using lower()
//        System.out.println("Using lower: " + numbers.lower(4));
//
//        // Using ceiling()
//        System.out.println("Using ceiling: " + numbers.ceiling(4));
//
//        // Using floor()
//        System.out.println("Using floor: " + numbers.floor(3));
//
//    }
	
//	3. pollfirst() and pollLast() Methods
//	pollFirst() - returns and removes the first element from the set
//	pollLast() - returns and removes the last element from the set
	
	public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(4);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        // Using pollFirst()
        System.out.println("Removed First Element: " + numbers.pollFirst());

        // Using pollLast()
        System.out.println("Removed Last Element: " + numbers.pollLast());

        System.out.println("New TreeSet: " + numbers);
    }
}
