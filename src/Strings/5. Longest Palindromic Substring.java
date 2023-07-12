package Strings;

class LongestPalindrome {
    public String longestPalindromeBruteForce(String s) {

        //brute-force
        int max = 0;
        String max_length_palindrome = "";

        if(s.length() == 1){
            return s;
        }


        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                boolean isPalindrome = true;
                int m = i;
                int n = j;
                while(m < n){
                    if(s.charAt(m) != s.charAt(n)){
                        isPalindrome = false; break;
                    }
                    m++; n--;
                }

                int length = s.substring(i, j + 1).length();
                if(isPalindrome){
                    // System.out.println("This should be a palindrome string ->" + s.substring(i,j+1));
                    max = Math.max(max,
                            length);
                }
                if(length >= max && isPalindrome){
                    max_length_palindrome = s.substring(i,j+1);
                }
            }
        }

        return max_length_palindrome;
    }

    public String longestPalindrome(String s) {
        int currLen = 0, maxLen = 0;
        int n = s.length();
        String longestPalindrome = "";

        if(s.length() <= 1){
            return s;
        }else if(s.length()%2 != 0){
            //Code for odd length palindrome
            for(int centerIndex = 1; centerIndex < n - 1; centerIndex++){
                int leftIndex = centerIndex - 1, rightIndex = centerIndex + 1;
                //Continue while both the indices are in range and  characters are matching
                while(leftIndex >= 0 && rightIndex < n && s.charAt(leftIndex) == s.charAt(rightIndex)){
                    leftIndex--;
                    rightIndex++;
                }
                //Calculate the current Palindrome length using formula (r - l + 1)
                currLen = (rightIndex - 1) - (leftIndex + 1) + 1 ;
                //if curr length is greater than the maxLen we have, update longestPalindrome and maxLen
                if(currLen > maxLen){
                    maxLen = currLen;
                    longestPalindrome = s.substring(leftIndex + 1, rightIndex);
                }}
        }else {
            //Code for even length palindrome
            for(int centerIndex = 0; centerIndex < n ; centerIndex++){
                int leftIndex = centerIndex, rightIndex = centerIndex + 1;
                while(leftIndex >= 0 && rightIndex < n && s.charAt(leftIndex) == s.charAt(rightIndex)){
                    leftIndex--;
                    rightIndex++;
                }
                currLen = (rightIndex - 1) - (leftIndex + 1) + 1 ;
                if(currLen > maxLen){
                    maxLen = currLen;
                    longestPalindrome = s.substring(leftIndex + 1, rightIndex);
                }
            }}
        //If you didn't find any palindrome then return 1 length palidnrome
        if(longestPalindrome.isEmpty()){
            return s.substring(0,1);
        }
        return longestPalindrome;
    }

}
