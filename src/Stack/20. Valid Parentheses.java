package Stack;

import java.util.Stack;

class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> charStack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{'){
                charStack.push(ch);
            }else if(charStack.isEmpty() || (ch == ')' && charStack.pop() != '(')
                    || (ch == ']' && charStack.pop() != '[')
                    || (ch == '}' && charStack.pop() != '{')){
                return false;
            }
        }

        return charStack.isEmpty();
    }
}
