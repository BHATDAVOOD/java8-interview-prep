package src.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfNumbers {

    /*
    * Given a list of integers, write a method to find the Sum of all the numbers using the Stream API.
    * */

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,4,5,6,7,8,9);
        System.out.println("Sum using reduce() : " + sumNumbersInList(numbers) );
        System.out.println("Sum using summingInt() : " + sumMumbersUsingSummingInt(numbers));
        System.out.println("Sum using mapToInt() : " + sumNumbersUsingMapToInt(numbers));
    }


    // Using reduce()
    public static int sumNumbersInList(List<Integer> numbers){
        return numbers.stream()
                .reduce(0, Integer::sum);
    }

    // Using SummingInt()
    public static int sumMumbersUsingSummingInt(List<Integer> numbers){
        return numbers.stream()
                .collect(Collectors.summingInt(Integer::intValue));
    }

    // Using mapToInt()
    public static int sumNumbersUsingMapToInt(List<Integer> numbers){
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}
