package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> anagram = new HashMap<>();

        //sort each string, since sorted anagram string will have same characters,
        //they will map to same key
        for(String str : strs){
            char[] ch = str.toCharArray();
            java.util.Arrays.sort(ch);
            String key = new String(ch);

            if(anagram.containsKey(key)){
                anagram.get(key).add(str);
            }else {
                List<String> words = new ArrayList<>();
                words.add(str);
                anagram.put(key,words);
            }
        }

        List<List<String>> result = new ArrayList<>();
        for(Map.Entry<String,List<String>> data : anagram.entrySet()){
            result.add(data.getValue());
        }

        return result;
    }
}
