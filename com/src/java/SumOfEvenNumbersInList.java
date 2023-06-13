package src.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfEvenNumbersInList {

    /*
    * Given a list of integers, write a method to find the sum of all even numbers using the Stream API.
    * */

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,7);
        System.out.println("Sum of Even Numbers using mapToInt() : " + sumOfEvenNumbersUsingMapToInt(numbers));
        System.out.println("Sum of Even Numbers using reduce() : " + sumUsingReduce(numbers));
        System.out.println("Sum of Even Numbers using summingInt() : " + sumUsingSummingInt(numbers));
    }

    public static int sumOfEvenNumbersUsingMapToInt(List<Integer> numbers){
        return numbers.stream()
                    .filter(number -> number % 2 == 0)
                    .mapToInt(Integer::intValue)
                    .sum();
    }

    public static int sumUsingReduce(List<Integer> numbers){
        return numbers.stream()
                .filter(number->number % 2 == 0)
                .reduce(0, Integer::sum);
    }

    public static int sumUsingSummingInt(List<Integer> numbers){
        return numbers.stream()
                .filter(number->number % 2 == 0)
                .collect(Collectors.summingInt(Integer::intValue));
    }
}
