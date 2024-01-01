package SlidingWindow;

class CheckInclusion {

    public boolean checkInclusion(String s1, String s2) {

        // if s1 is less than s2 string, return false
        if(s1.length() > s2.length())
            return false;

        int[] arr = new int[26];

        // keeping track of no of occurences of character in s1 string
        for(int i=0;i<s1.length();i++){
            arr[s1.charAt(i) - 'a']++;
        }
        int i=0,j=0;

        // Move right pointer to fit s1 window size
        for(j=0;j<s1.length(); j++){
            arr[s2.charAt(j) - 'a']--;
        }

        if(isEmpty(arr)) return true;
        j--;

        // check the occurence in rest of string
        while(j <  s2.length()){
            arr[s2.charAt(i) - 'a']++;
            i++;
            j++;if (j < s2.length()) arr[s2.charAt(j) - 'a']--;
            if (isEmpty(arr)) return true;
        }
        return isEmpty(arr);
    }

    public boolean isEmpty(int[] arr){
        for (int j : arr) {
            if (j != 0) return false;
        }
        return true;
    }

    public static void main(String[] args){
        CheckInclusion ci = new CheckInclusion();
        ci.checkInclusion("ab","eduhbauuu");
    }
}
