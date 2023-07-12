package SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {

        if(s.length() == 0) return 0;

        int max = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0,j=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                j = Math.max(j, map.get(s.charAt(i)) + 1);
                // This ensures that j always stores the index of the last occurrence of the current character.
            }
            map.put(s.charAt(i),i);

            max = Math.max(max,i-j+1);
        }

        return max;
    }

    public int sol2(String s) {
        List<Character> substringL = new ArrayList<>();
        int largestlength = 0;
        for(int right = 0; right < s.length(); right++) {
            if(substringL.contains(s.charAt(right))) {
                // get the index of the char
                int index = substringL.indexOf(s.charAt(right));
                substringL.remove(index);
                if(index > 0)
                    substringL.subList(0, index).clear();
            }
            substringL.add(s.charAt(right));
            largestlength = Math.max(largestlength, substringL.size());
        }
        return largestlength;
    }


}
