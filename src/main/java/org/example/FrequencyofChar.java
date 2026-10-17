package org.example;

import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyofChar {
    public static void main(String[] args) {
        String input = "success";
        Map<Character, Long> freq = input.chars()
                .mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(c->c,Collectors.counting()));
        System.out.println("frequency:" + freq);
    }
}