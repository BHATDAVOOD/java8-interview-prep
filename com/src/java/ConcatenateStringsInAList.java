package src.java;

import java.util.Arrays;
import java.util.List;

public class ConcatenateStringsInAList {

    /*
    * Write a method to concatenate all the strings in a list using the reduce() method in the Stream API.
    * */

    public static void main(String[] args) {

        List<String> name = Arrays.asList("Davood"," ","Ahmad"," ","Bhat");
        String myName = concatenateAllStrings(name);
        System.out.println("My Name is : " + myName);
    }

    public static String concatenateAllStrings(List<String> name){
        return name.stream()
                .reduce("",(s1,s2) -> s1+s2);
    }
}
