class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i+1, j+1};
                }
            }
        }
        return new int[] {-1, -1};
        */

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            if (nums[left] + nums[right] > target)
                right--;
            else if (nums[left] + nums[right] < target)
                left++;
            else
                break;
        }
        return new int[] {left+1, right+1};
    }
}
