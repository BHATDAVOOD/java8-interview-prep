package src.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LengthOfStrings {
    public static void main(String[] args) {

        /*
        * Implement a method that takes a list of strings and returns the List of strings that have a length greater than "N" using the Stream API.
        * */

        List<String> fruits =
                Arrays.asList("apple","orange","grapes","papaya","pineapple","pomegranate");

        System.out.println(fruitsWithNLength(fruits));

    }

    public static List<String> fruitsWithNLength(List<String> fruits){

        return fruits.stream()
                .filter(fruit -> fruit.length() >= 7)
                .collect(Collectors.toList());
    }
}
