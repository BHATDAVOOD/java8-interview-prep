package src.java;

import java.util.Arrays;
import java.util.List;

public class PalindromeStringsInList {

    /*
    * Write a lambda expression to filter out all strings that are palindromes from a list of strings.
    * */

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("madam","hello","racecar","world");
        System.out.println(palindromeStrings(stringList));
    }

    public static List<String> palindromeStrings(List<String> stringList){

         return stringList.stream()
                    .filter(s->new StringBuilder(s).reverse().toString().equals(s))
                    .toList();
    }
}
