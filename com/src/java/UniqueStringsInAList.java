package src.java;

import java.util.Arrays;
import java.util.List;

public class UniqueStringsInAList {

    /*
    * Implement a method that takes a list of strings and returns a new list containing only the unique strings in
    * (a) Ascending order
    * (b) Descending Order
    * using the Stream API.
    * */

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("cherry","banana","pomegranate","apple","apple");
        System.out.println("Ascending Order : " + uniqueStringsInAscendingOrder(fruits));
        System.out.println("Descending Order : " + uniqueStringsInDescendingOrder(fruits));
    }

    public static List<String> uniqueStringsInAscendingOrder(List<String> fruits){

        return fruits.stream()
                    .distinct()
                    .sorted()
                    .toList();
    }

    public static List<String> uniqueStringsInDescendingOrder(List<String> fruits){

        return fruits.stream()
                .distinct()
                .sorted((s1,s2)->s2.compareTo(s1))
                .toList();
    }


}
