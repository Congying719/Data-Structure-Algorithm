package backTracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CombinationNumbersLC77 {

    public static List<List<Integer>> result = new ArrayList<>();
    public static LinkedList<Integer> path = new LinkedList<>();

    public static void main(String[] args) {
        combine(5,3);
        System.out.println(result.size());
    }

    public static List<List<Integer>> combine(int n, int k) {
        backtracking(n,k,1);
        System.out.println(result.size());
        return result;
    }

    public static void backtracking(int n,int k,int startIndex){
        if (path.size() == k){
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i =startIndex;i<=n;i++){
            path.add(i);
            backtracking(n,k,i+1);
            path.removeLast();
        }
    }
}
