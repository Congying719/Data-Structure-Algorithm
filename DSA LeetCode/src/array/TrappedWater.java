package array;

public class TrappedWater {

    public static void main(String[] args) {

        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int trappedWater = trapThird(height);
        System.out.println("Total trapped water: " + trappedWater);//6

        int[] height2 = {4,2,0,3,2,5};
        int trappedWater2 = trapThird(height2);
        System.out.println("Total trapped water: " + trappedWater2);//9
    }

    public static int trap(int[] height) {
        if (height == null || height.length < 3) {
            return 0; // Not enough walls to trap water
        }

        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int trappedWater = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] > leftMax) {
                    leftMax = height[left];
                } else {
                    trappedWater += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] > rightMax) {
                    rightMax = height[right];
                } else {
                    trappedWater += rightMax - height[right];
                }
                right--;
            }
        }

        return trappedWater;
    }

    public static int trapSecond(int[] height) {
        int leftMax = height[0];
        int trap = 0;

        for(int i = 1;i < height.length -1;i++) {
            //先查看左边是否有比这个值更高的值，如果没有，左边最高值更新为当前值，如果有，继续去看右边最高值
            //右边最高值也高于当前值的话，取左右较小值和当前值的差值
            int rightMax = 0;
            if(height[i] < leftMax) {
                for(int j = i+1; j < height.length;j++) {
                    rightMax = Math.max(rightMax,height[j]);
                }

                if (rightMax > height[i]) {
                    trap += (Math.min(rightMax, leftMax) - height[i]);
                }
            } else {
                leftMax = height[i];
            }
        }
        return trap;
    }

    public static int trapThird(int[] height) {
        int trap = 0;
        int maxLeft = height[0];
        int n = height.length;
        int maxRight = height[n-1];
        int left = 1;
        int right = n - 2;
        while(left < right) {
            //如果左边最大 > 右边最大, 以左边值为基准
            if(height[left] < height[right]) {
                if (maxLeft < height[left]) {
                    //当前值比左边最大值要大，not save water, only move pointer and change the max
                    maxLeft = height[left];
                } else {
                    //储水
                    trap += (maxLeft - height[left]);
                }
                left++;
            } else {
                if (maxRight < height[right]) {
                    //当前值比边最大值要大，not save water, only move pointer and change the max
                    maxRight = height[right];
                } else {
                    //储水
                    trap += (maxRight - height[right]);
                }
                right--;
            }
        }

        return trap;
    }
}
