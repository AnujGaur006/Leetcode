package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

class MinWindow{
    public String minWindow(String s, String t) {
        if(t.length() > s.length() || t.length() ==0 || s.length() == 0){
            return "";
        }

        // Create a map to track the count of characters in the target string
        Map<Character, Integer> targetChars = new HashMap<>();
        for (char c : t.toCharArray()) {
            targetChars.put(c, targetChars.getOrDefault(c, 0) + 1);
        }

        int left = 0; // Left pointer
        int minLeft = 0; // Left index of the minimum window substring
        int minLen = Integer.MAX_VALUE; // Length of the minimum window substring
        int missingChars = t.length(); // Number of characters from the target string missing in the window


        // Traverse the string using the right pointer
        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);

            // Decrement the count of the current character from the target string
            if (targetChars.containsKey(rightChar)) {
                int count = targetChars.get(rightChar);
                if (count > 0) {
                    missingChars--;
                }
                targetChars.put(rightChar, count - 1);
            }

            // Try to minimize the window by moving the left pointer
            while (missingChars == 0) {
                // Update the minimum window substring if a smaller length is found
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minLeft = left;
                }

                char leftChar = s.charAt(left);

                // Increment the count of the current character from the target string
                if (targetChars.containsKey(leftChar)) {
                    int count = targetChars.get(leftChar);
                    if (count == 0) {
                        missingChars++;
                    }
                    targetChars.put(leftChar, count + 1);
                }

                left++; // Move the left pointer to the right
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft + minLen);
    }
}
