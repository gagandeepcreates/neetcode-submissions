class Solution {
    public int shipWithinDays(int[] weights, int days) {

        // Minimum capacity = maximum single package
        int low = 0;

        // Maximum capacity = sum of all packages
        int high = 0;

        for (int weight : weights) {
            low = Math.max(low, weight);
            high += weight;
        }

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int requiredDays = 1;
            int currentWeight = 0;

            // Calculate how many days are needed with capacity = mid
            for (int weight : weights) {

                // If adding this package exceeds capacity,
                // ship current load and start a new day.
                if (currentWeight + weight > mid) {
                    requiredDays++;
                    currentWeight = weight;
                } else {
                    currentWeight += weight;
                }
            }

            // Capacity is sufficient
            if (requiredDays <= days) {
                high = mid - 1;
            }
            // Capacity is too small
            else {
                low = mid + 1;
            }
        }

        return low;
    }
}