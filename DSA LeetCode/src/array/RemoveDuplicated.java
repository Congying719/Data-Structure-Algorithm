package array;

public class RemoveDuplicated {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3, 4, 4, 5,5,5,7};
        int uniqueCount = removeDuplicates(nums);

        System.out.println("New Length: " + uniqueCount); // Output: 5
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(nums[i] + " "); // Output: 1 2 3 4 5
        }
    }
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int uniqueCount = 1; // Initialize the count of unique elements as 1 (the first element is always unique).

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueCount] = nums[i]; // Shift the unique element to the front of the array.
                uniqueCount++;
            }
        }
        return uniqueCount;
    }
}
