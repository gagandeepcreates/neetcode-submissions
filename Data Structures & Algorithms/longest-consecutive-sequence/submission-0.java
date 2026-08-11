class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums)
            set.add(num);

        int longest = 0;

        for (int num : set) {

            // Start only if num is the beginning of a sequence
            if (!set.contains(num - 1)) {

                int current = num;
                int streak = 1;

                while (set.contains(current + 1)) {
                    current++;
                    streak++;
                }

                longest = Math.max(longest, streak);
            }
        }

        return longest;
    }
}