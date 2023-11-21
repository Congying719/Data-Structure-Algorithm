package dynamicProgramming;

public class MinCostClimbingStairsLC746 {

    public static void main(String[] args) {
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(getMinCostClimbStair(cost.length, cost, 0,0));
        int[] cost1 = {10,15,20};
        System.out.println(getMinCostClimbStair(cost1.length, cost1, 0,0));

    }

    public static int getMinCostClimbStair(int N, int[] cost, int first, int second) {
        int res = 0;

        for (int i = 3; i <= (N+1); i++) {
            res = Math.min((first+cost[i-3]), (second + cost[i-2]));
            first = second;
            second = res;
        }
        return res;
    }
}
