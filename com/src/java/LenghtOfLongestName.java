package src.java;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LenghtOfLongestName {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("davood","ahmad","bhat","shugufta");
        System.out.println(longestNameLength(names));
    }

    public static int longestNameLength(List<String> names){

        return names.stream()
                .min((name1, name2) -> Integer.compare(name2.length(), name1.length()))
                .get()
                .length();

    }
}
