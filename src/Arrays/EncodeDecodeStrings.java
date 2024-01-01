package Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeDecodeStrings {
    public static String encode(List<String> strs) {
        // write your code here
        String result = "";
        for(int i=0;i<strs.size()-1;i++){
            result += strs.get(i) + ";:";
        }
        result += strs.get(strs.size()-1);
        return result;
    }

    public static List<String> decode(String str) {
        // write your code here
        return new ArrayList<String>(Arrays.asList(str.split(";:")));
    }

    public static void main(String[] args){
        List<String> input = new ArrayList<>(Arrays.asList("lint","code","love","you"));
        String encodeString = encode(input);
        List<String> output = decode(encodeString);
        System.out.println(output);
    }
}
