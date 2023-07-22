package StackProblems;

import java.util.List;
import java.util.ArrayList;

class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        solve("",0,0,ans,n);
        return ans;
    }

    public void solve(String current, int left, int right, List<String> ans, int n){
        if(current.length() == n*2){
            ans.add(current);
            return;
        }

        if(left < n){
            solve(current + "(", left + 1, right, ans, n);
        }

        if(right < left){
            solve(current + ")", left , right + 1, ans, n);
        }
    }
}
