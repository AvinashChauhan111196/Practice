package list;

import java.util.ArrayList;
import java.util.List;

public class AddList {

	public static void main(String args[])
    {
        // Creating an object of List interface,
        // implemented by ArrayList class
        List<String> al = new ArrayList<>();

        // Adding elements to object of List interface
        // Custom elements
        al.add("Geeks");
        al.add("Geeks");
        al.add(1, "For");
        al.add(3, "Check 3");
        // again if we add at index 3 it will be added and move previous index data to next
        al.add(3, "Check update");

        // Print all the elements inside the
        // List interface object
        System.out.println(al);
        // using get method to get the element for a particular index
        System.out.println(al.get(4));
    }
	
}
