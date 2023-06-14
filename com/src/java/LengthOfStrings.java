package src.java;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LengthOfStrings {
    public static void main(String[] args) {

        /*
        * Implement a method that takes a list of strings and returns
        * (a) the List of strings that have a length greater than "N"
        * (b) the Count of strings that have a length greater than "N"
         * using the Stream API.
        * */

        int length;
        System.out.println("Enter the Length of the String....");
        try (Scanner sc = new Scanner(System.in)) {
            length = sc.nextInt();
        }

        List<String> fruits =
                Arrays.asList("apple","orange","grapes","papaya","pineapple","pomegranate");

        System.out.println(fruitsWithNLength(fruits,length));
        System.out.println("---------------------------------------");
        System.out.println("Number of Fruits with Length greater than or equal to " + length + " : "+ countOfFruitsWithNLength(fruits,length));

    }

    // Returns List of Fruits with length greater than or equal to length
    public static List<String> fruitsWithNLength(List<String> fruits, int length){

        return fruits.stream()
                .filter(fruit -> fruit.length() >= length)
                .collect(Collectors.toList());
    }

    // Returns Count of Fruits with length greater than or equal to length
    public static long countOfFruitsWithNLength(List<String> fruits, int length){
        return fruits.stream()
                .filter(fruit -> fruit.length() >= length)
                .count();
    }
}
