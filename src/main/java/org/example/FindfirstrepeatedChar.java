package org.example;

        import java.util.*;
        import java.util.stream.Collectors;

public class FindfirstrepeatedChar {
    public static void main(String[] args) {
        String input = "success";
        Set<Character> myset= new HashSet<>();
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

               Optional<Character> repeatedchar = input.chars().
                 mapToObj(c -> (char) c).
                 filter(c -> ! myset.add(c)).findFirst();
        System.out.println("frequency:" + repeatedchar);

       // System.out.println("frequency:" + repeatedchar.orElse(" "));
    }
}