package Stack;

import java.util.Stack;

class RemoveStars {
    public String removeStars(String s) {

        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch != '*'){
                stack.push(ch);
            }else stack.pop();
        }

        StringBuilder str = new StringBuilder();
        for(char ch : stack){
            str.append(ch);
        }

        return str.toString();

    }
}