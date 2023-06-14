package src.java;

import java.util.Arrays;
import java.util.List;

public class StringsInDescendingOrderOfLength {

    /*
    * Write a lambda expression to sort a list of strings in descending order of length.
    * */

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("cherry","apple","pomegranate","banana");
        System.out.println(sortedStrings(fruits));
    }


    public static List<String> sortedStrings(List<String> fruits){

        return fruits.stream()
                    .sorted((fruit1,fruit2) -> Integer.compare(fruit2.length(),fruit1.length()))
                    .toList();
    }
}
