package Arrays;

import java.util.Arrays;

public class CheckPermutation {
    // Easy but few things to be consider
    // Do we have to check for case sensitive strings
    // is whitespace is significant
    public static boolean isPermutation(String t, String s){
        if(t.length() != s.length())
            return false;

        // by sorting
        return sort(s).equals(sort(t));
    }

    public static String sort(String s){
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }

    public static void main(String[] args){
        //remove Spaces
        System.out.println(isPermutation("dog","god "));
    }
}
