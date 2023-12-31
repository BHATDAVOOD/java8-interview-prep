package src.java;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LenghtOfLongestName {

    /*
    * Given a list of names, write a method to find the length of the longest name using the Stream API.
    * */

    public static void main(String[] args) {

        List<String> names = Arrays.asList("davood","ahmad","bhat","gadiseer");
        System.out.println(longestNameLength(names));
    }

    public static int longestNameLength(List<String> names){

        return names.stream()
                .min((name1, name2) -> Integer.compare(name2.length(), name1.length()))
                .get()
                .length();

    }
}
