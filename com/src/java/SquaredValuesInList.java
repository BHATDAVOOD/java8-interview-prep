package src.java;

import java.util.Arrays;
import java.util.List;

public class SquaredValuesInList {

    /*
    * Implement a method that takes a list of integers and returns a new list containing the squared values of all the numbers using the map() method in the Stream API.
    * */

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
        System.out.println("Initial List : " + numbers);
        System.out.println("List after being Squared : " + squareNumbers(numbers));
    }

    public static List<Integer> squareNumbers(List<Integer> numbers){

        return numbers.stream()
                    .map(number->number*number)
                    .toList();
    }
}
