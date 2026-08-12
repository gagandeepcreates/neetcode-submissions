class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);

        int expected = 1;

        for (int num : nums) {
            if (num == expected) {
                expected++;
            }
        }

        return expected;

    }
}