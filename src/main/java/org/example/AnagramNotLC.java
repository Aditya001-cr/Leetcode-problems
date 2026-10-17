package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnagramNotLC {
    public static List<List<String>> anagrams(String[] str){
        Map<String,List<String>> map= new HashMap<>();
        for(String word:str){
            String sortedword=word.chars().sorted().
                    mapToObj(Character::toString).
                    collect(Collectors.joining());
            if(!map.containsKey(sortedword)){
                map.put(sortedword,new ArrayList<>());
            }
           // map.put(sortedword,add(word));
          map.get(sortedword).add(word);
        }
      return new ArrayList<>(map.values());
    }

    public static void main(String[] args){
        String[] str ={"eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> mylist = anagrams(str);
        System.out.println(mylist);
    }
}
