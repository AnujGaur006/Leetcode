package StackProblems;

import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> numStack = new Stack<>();

        for(String str : tokens){
            if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")){
                int num1 = numStack.pop();
                int num2 = numStack.pop();
                switch (str) {
                    case "+" -> numStack.push(num2 + num1);
                    case "-" -> numStack.push(num2 - num1);
                    case "*" -> numStack.push(num2 * num1);
                    case "/" -> numStack.push(num2 / num1);
                }
            }else numStack.push(Integer.parseInt(str));
        }

        System.out.println(numStack);
        return numStack.pop();

    }
}