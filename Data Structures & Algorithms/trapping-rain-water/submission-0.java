class Solution {
    public int trap(int[] height) {
        int[] leftMaxHeight = new int[height.length];
        leftMaxHeight[0] = height[0];
        int[] rightMaxHeight = new int[height.length];
        rightMaxHeight[height.length - 1] = height[height.length - 1];
        int ans = 0;

        for (int i = 1; i < height.length; i++)
            leftMaxHeight[i] = Math.max(leftMaxHeight[i-1], height[i]);
        
        for (int i = height.length - 2; i >= 0; i--)
            rightMaxHeight[i] = Math.max(rightMaxHeight[i+1], height[i]);

        for (int i = 0; i < height.length; i++) 
            ans += Math.min(leftMaxHeight[i], rightMaxHeight[i]) - height[i];

        return ans;
    }
}
