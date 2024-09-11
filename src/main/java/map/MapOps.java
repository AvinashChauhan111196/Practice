package map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapOps {

//	1. Add elements to a HashMap
//	To add a single element to the hashmap, we use the put() method of the HashMap class. For example,

//	public static void main(String[] args) {
//
//	    // create a hashmap
//	    HashMap<String, Integer> numbers = new HashMap<>();
//
//	    System.out.println("Initial HashMap: " + numbers);
//	    // put() method to add elements
//	    numbers.put("One", 1);
//	    numbers.put("Two", 2);
//	    numbers.put("Three", 3);
//	    System.out.println("HashMap after put(): " + numbers);
//	  }
	
//	2. Access HashMap Elements
//	We can use the get() method to access the value from the hashmap. For example,
	
//	public static void main(String[] args) {
//
//	    HashMap<Integer, String> languages = new HashMap<>();
//	    languages.put(1, "Java");
//	    languages.put(2, "Python");
//	    languages.put(3, "JavaScript");
//	    System.out.println("HashMap: " + languages);
//
//	    // get() method to get value
//	    String value = languages.get(1);
//	    System.out.println("Value at 3: " + languages.get(3));
//	  }
	
//	Here, the get() method takes the key as its argument and returns the corresponding value associated with the key.
//
//	We can also access the keys, values, and key/value pairs of the hashmap as set views using keySet(), 
//	values(), and entrySet() methods respectively. For example,
	
	
	
//	public static void main(String[] args) {
//	    HashMap<Integer, String> languages = new HashMap<>();
//
//	    languages.put(1, "Java");
//	    languages.put(2, "Python");
//	    languages.put(3, "JavaScript");
//	    System.out.println("HashMap: " + languages);
//
//	    // return set view of keys
//	    // using keySet()
//	    System.out.println("Keys: " + languages.keySet());
//
//	    // return set view of values
//	    // using values()
//	    System.out.println("Values: " + languages.values());
//
//	    // return set view of key/value pairs
//	    // using entrySet()
//	    System.out.println("Key/Value mappings: " + languages.entrySet());
//	  }
	
//	3. Change HashMap Value
//	We can use the replace() method to change the value associated with a key in a hashmap. For example,	
	
//	public static void main(String[] args) {
//
//	    HashMap<Integer, String> languages = new HashMap<>();
//	    languages.put(1, "Java");
//	    languages.put(2, "Python");
//	    languages.put(3, "JavaScript");
//	    System.out.println("Original HashMap: " + languages);
//
//	    // change element with key 2
//	    languages.replace(2, "C++");
//	    System.out.println("HashMap using replace(): " + languages);
//	  }
	
//	4. Remove HashMap Elements
//	To remove elements from a hashmap, we can use the remove() method. For example,
	
//	public static void main(String[] args) {
//
//	    HashMap<Integer, String> languages = new HashMap<>();
//	    languages.put(1, "Java");
//	    languages.put(2, "Python");
//	    languages.put(3, "JavaScript");
//	    System.out.println("HashMap: " + languages);
//
//	    // remove element associated with key 2
//	    String value = languages.remove(2);
//	    System.out.println("Removed value: " + value);
//
//	    System.out.println("Updated HashMap: " + languages);
//	  }
	
//	Iterate through a HashMap
//	To iterate through each entry of the hashmap, we can use Java for-each loop. 
//	We can iterate through keys only, vales only, and key/value mapping. For example,
	
//	public static void main(String[] args) {
//
//	    // create a HashMap
//	    HashMap<Integer, String> languages = new HashMap<>();
//	    languages.put(1, "Java");
//	    languages.put(2, "Python");
//	    languages.put(3, "JavaScript");
//	    System.out.println("HashMap: " + languages);
//
//	    // iterate through keys only
//	    System.out.print("Keys: ");
//	    for (Integer key : languages.keySet()) {
//	      System.out.print(key);
//	      System.out.print(", ");
//	    }
//
//	    // iterate through values only
//	    System.out.print("\nValues: ");
//	    for (String value : languages.values()) {
//	      System.out.print(value);
//	      System.out.print(", ");
//	    }
//	    
//	    // iterate through key/value entries
//	    System.out.print("\nEntries: ");
//	    for (Entry<Integer, String> entry : languages.entrySet()) {
//	      System.out.print(entry);
//	      System.out.print(", ");
//	    }
//	  }
	
//	Creating HashMap from Other Maps
//	In Java, we can also create a hashmap from other maps. For example,
	
	public static void main(String[] args) {

	    // create a treemap
	    TreeMap<String, Integer> evenNumbers = new TreeMap<>();
	    evenNumbers.put("Two", 2);
	    evenNumbers.put("Four", 4);
	    System.out.println("TreeMap: " + evenNumbers);

	    // create hashmap from the treemap
	    HashMap<String, Integer> numbers = new HashMap<>(evenNumbers);
	    numbers.put("Three", 3);
	    System.out.println("HashMap: " + numbers);
	  }
	
	
}


