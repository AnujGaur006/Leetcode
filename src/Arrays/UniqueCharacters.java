package Arrays;

public class UniqueCharacters {
    public static boolean uniqueChars(String str){

        // here assumption is that string only contains alphabatic characters
        // in case of 256 ASCII code string (128 characters alphabet), equivalent boolean array can be created
        // to check for unique chars

        int[] count = new int[26];

        for(int i=0; i<str.length();i++){
            count[str.charAt(i)-'a']++;
        }

        for (int character : count) {
            if (character > 1)
                return true;
        }

        return false;
    }

    public static void main(String[] args){
        System.out.println("leetcode :" + uniqueChars("leetcode"));
        System.out.println("unique :" + uniqueChars("unique"));
        System.out.println("unique :" + uniqueChars("string"));
    }
}
