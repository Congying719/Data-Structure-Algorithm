package array;

public class findMaxNonAdjacentSum {

    public static void main(String[] args) {
        int[] numss = {2, 4, 6, 2, 9, 1, 5};
        int maxSum = findMaxNonAdjacentSum(numss);
        System.out.println("Maximum sum of non-adjacent elements: " + maxSum);
    }
    public static int findMaxNonAdjacentSum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int include = nums[0];
        int exclude = 0;
        //{2, 4, 6, 2, 9, 1, 5};
        for (int i = 1; i < nums.length; i++) {
            int newInclude = exclude + nums[i];
            int newExclude = Math.max(include, exclude);

            include = newInclude;
            exclude = newExclude;
        }

        return Math.max(include, exclude);
    }

}
