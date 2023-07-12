package SlidingWindow;

class CharacterReplacement {
    public int characterReplacement(String s, int k) {
        int[] arrCount = new int[26]; //Array to store occurences of each character
        int left = 0; //left pointer
        int max_length = 0; //max lenght of any character in current window
        int max_count = 0; //max count of each character in current window

        for(int right=0;right<s.length();right++){
            arrCount[s.charAt(right) - 'A']++; //Increment count for the current character
            max_count = Math.max(max_count, arrCount[s.charAt(right) - 'A']); // Update the max count

            int replacementNeeded = (right - left + 1) - max_count;

            //check if no of replacement needed exceed 'k'
            if(replacementNeeded > k){
                arrCount[s.charAt(left) - 'A']--;
                left++;
            }

            max_length = Math.max(max_length, right - left + 1); //Update the max count
        }

        return max_length;

    }
}
