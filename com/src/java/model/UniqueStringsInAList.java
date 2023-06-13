package src.java.model;

import java.util.Arrays;
import java.util.List;

public class UniqueStringsInAList {

    /*
    * Implement a method that takes a list of strings and returns a new list containing only the unique strings in alphabetical order using the Stream API.
    * */

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("cherry","banana","pomegranate","apple","apple");
        System.out.println(uniqueStringsInSortedOrder(fruits));
    }

    public static List<String> uniqueStringsInSortedOrder(List<String> fruits){

        return fruits.stream()
                    .distinct()
                    .sorted()
                    .toList();
    }
}
