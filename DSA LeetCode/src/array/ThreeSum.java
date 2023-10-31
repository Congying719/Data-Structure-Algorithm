package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {
        int[] nums3 = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = threeSum1(nums3);

        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }

    public static List<List<Integer>> findThree(int[] nums, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2;i++) {
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int sum  = -nums[i];
            int left = i+1;
            int right = nums.length - 1;
            while(left < right) {
                if (nums[left] + nums[right] == sum) {
                    lists.add(Arrays.asList(nums[i],nums[left], nums[right]));
                    while(nums[left] == nums[left+1]) {
                        if (left == nums.length - 2) {
                            break;
                        } else {
                            left++;
                        }
                    }
                    while(nums[right] == nums[right - 1]) {
                        if (right == 1) {
                            break;
                        } else {
                            right--;
                        }
                    }
                    left++;
                    right--;
                } else if (nums[left] + nums[right] < sum) {
                    left++;
                } else {
                    right--;
                }
            }

        }
        return lists;
    }

    public static List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        // Sort the array
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int target = -nums[i];
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum == target) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicates
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }
}
