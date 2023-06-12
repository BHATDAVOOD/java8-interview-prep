package src.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProductOfNumbers {

    /*
     * Given a list of integers, write a method to find the Product of all the numbers using the Stream API.
     * */

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        System.out.println("Product : " + productOfNumbersInList(numbers));
    }

    public static int productOfNumbersInList(List<Integer> numbers){

        return numbers.stream()
                .reduce(1,(number1,number2) -> number1 * number2);
    }
}
