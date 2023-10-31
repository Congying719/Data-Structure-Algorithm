package array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] numSum = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(numSum, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> maps = new HashMap<>();

        for(int i = 0; i < nums.length;i++) {
            int value = target - nums[i];
            if(maps.containsKey(nums[i])) {
                return new int[]{maps.get(nums[i]),i};
            } else {
                maps.put(value, i);
            }
        }
        return new int[]{};
    }
}
