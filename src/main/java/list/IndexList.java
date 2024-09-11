package list;

import java.util.ArrayList;
import java.util.List;

public class IndexList {

	public static void main(String[] args)
    {
        // create a list of integers
        List<Integer> numbers = new ArrayList<>();

        // add some integers to the list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);

        // use indexOf() to find the first occurrence of an
        // element in the list
        int index = numbers.indexOf(2);
        System.out.println(
            "The first occurrence of 2 is at index "
            + index);

        // use lastIndexOf() to find the last occurrence of
        // an element in the list
        int lastIndex = numbers.lastIndexOf(2);
        System.out.println(
            "The last occurrence of 2 is at index "
            + lastIndex);
    }
}
