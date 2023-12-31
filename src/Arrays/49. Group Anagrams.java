package Arrays;

import java.util.*;
import java.util.stream.Collectors;

class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> anagram = new HashMap<>();

        //sort each string, since sorted anagram string will have same characters,
        //they will map to same key
        for(String str : strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);

            if(anagram.containsKey(key)){
                anagram.get(key).add(str);
            }else {
                List<String> words = new ArrayList<>();
                words.add(str);
                anagram.put(key,words);
            }
        }

        return new ArrayList<>(anagram.values());
    }
}
