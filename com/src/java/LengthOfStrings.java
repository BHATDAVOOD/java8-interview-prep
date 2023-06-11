package src.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LengthOfStrings {
    public static void main(String[] args) {

        /*
        * Implement a method that takes a list of strings and returns
        * (a) the List of strings that have a length greater than "N"
        * (b) the Count of strings that have a length greater than "N"
         * using the Stream API.
        * */

        List<String> fruits =
                Arrays.asList("apple","orange","grapes","papaya","pineapple","pomegranate");

        System.out.println(fruitsWithNLength(fruits));
        System.out.println("---------------------------------------");
        System.out.println("Number of Fruits with Length greater than or equal to 7 : "+ countOfFruitsWithNLength(fruits));

    }

    // Returns List of Fruits with length greater than or equal to 7
    public static List<String> fruitsWithNLength(List<String> fruits){

        return fruits.stream()
                .filter(fruit -> fruit.length() >= 7)
                .collect(Collectors.toList());
    }

    // Returns Count of Fruits with length greater than or equal to 7
    public static long countOfFruitsWithNLength(List<String> fruits){
        return fruits.stream()
                .filter(fruit -> fruit.length() >= 7)
                .count();
    }
}
