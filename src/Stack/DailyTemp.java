package Stack;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemp {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for(int j = 0; j < temperatures.length; j++){
            while(!stack.isEmpty() && temperatures[j] > temperatures[stack.peek()]){
                int prev = stack.pop();
                result[prev] = j - prev;
            }
            stack.add(j);
        }

        return result;

    }

    public static void main(String[] args){
        int[][] combine = new int[][]{{10,2},{8,4},{5,1},{3,3},{0,1}};
        Arrays.sort(combine, java.util.Comparator.comparingInt(o -> o[0]));
    }
}
