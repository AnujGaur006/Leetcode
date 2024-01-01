package Arrays;

public class RemoveSpaces {
    public static String removeSpaces(String str){
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for(int i=0;i<words.length; i++){
            result.append(words[i]);
            if(i != words.length - 1){
                result.append("%20");
            }
        }
        return result.toString();
    }

    public static void main(String[] args){
        //remove Spaces
        System.out.println("Mr John Smith :" + removeSpaces("Mr John Smith"));
    }
}
