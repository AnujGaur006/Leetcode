package StackProblems;

import java.util.Stack;

class DailyTemp {
    public int[] dailyTemperatures(int[] temperatures) {
        // brute force

        int[] ans = new int[temperatures.length];

        Stack<Integer> st = new Stack<>();

        for(int i=0;i<temperatures.length;i++){
            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){

                int prevday = st.pop();
                ans[prevday] = i - prevday;
            }
            st.add(i);
        }

        return ans;

    }
}
