package src.java;

import java.util.Arrays;
import java.util.List;

public class SumOfSquaresOfEvenNumbers {


    /*
    * Implement a method that takes a list of integers and returns the sum of the squares of all the even numbers using the Stream API.
    * */

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,8);
        System.out.println(sumOfEvenNumbers(numbers));
    }

    public static int sumOfEvenNumbers(List<Integer> numbers){

        return numbers.stream()
                .filter(number->number % 2 == 0)
                .map(number->number*number)
                .reduce(0, Integer::sum);
    }
}
