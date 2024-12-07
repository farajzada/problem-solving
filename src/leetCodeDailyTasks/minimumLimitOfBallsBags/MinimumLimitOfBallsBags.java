package leetCodeDailyTasks.minimumLimitOfBallsBags;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumLimitOfBallsBags {
    public static int minimumSize(int[] nums, int maxOps) {
        int low = 1, high = Arrays.stream(nums).max().getAsInt();
        while (low < high) {
            int mid = (low + high) / 2;
            int ops = 0;
            for (int n : nums) {
                ops += (n - 1) / mid;
            }
            if (ops <= maxOps) high = mid;
            else low = mid + 1;
        }
        return high;
    }

    public static void main(String[] args) {
        MinimumLimitOfBallsBags minimumLimitOfBallsBags= new MinimumLimitOfBallsBags();

        int[] nums1 = {9, 7, 13, 11};
        int maxOps1 = 5;
        int result1 = MinimumLimitOfBallsBags.minimumSize(nums1, maxOps1);
        System.out.println("Minimum size for first example: " + result1);

        int[] nums2 = {3, 5, 7, 8};
        int maxOps2 = 2;
        int result2 = MinimumLimitOfBallsBags.minimumSize(nums2, maxOps2);
        System.out.println("Minimum size for second example: " + result2);

    }
}
