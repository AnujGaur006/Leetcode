package Strings;

class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder str = new StringBuilder();

        // removing all non-alphanumeric characters
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z')
                    || (s.charAt(i)>='0' && s.charAt(i)<='9')){
                str.append(s.charAt(i));
            }
        }

        //converting to Lowercase
        s = str.toString().toLowerCase();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                return false;
            }
        }

        return true;

    }
}
