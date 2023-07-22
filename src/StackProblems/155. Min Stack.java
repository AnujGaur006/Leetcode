package StackProblems;

class Stack<I extends Number> {

    class Node{
        Node next;
        int item;

        public Node(int item){
            this.item = item;
        }
    }

    Node top = null;


    public void push(int val){
        Node temp = top;
        top = new Node(val);
        top.next = temp;
    }

    public void pop(){
        top = top.next;
    }

    public int top(){
        return top.item;
    }

    public int getMin(){
        int min = Integer.MAX_VALUE;
        Node temp = top;
        while(temp != null){

            min =  Math.min(min, temp.item);
            temp = temp.next;
        }

        return min;
    }
}


class MinStack {

    private java.util.Stack<Integer> stack;
    private java.util.Stack<Integer> minStack;

    public MinStack() {
        stack = new java.util.Stack<Integer>();
        minStack = new java.util.Stack<Integer>();
    }

    public void push(int val) {
        stack.push(val);

        // The min stack may be empty, so we need to check it
        val = Math.min(val, minStack.isEmpty() ? val : minStack.peek());
        minStack.push(val);
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

