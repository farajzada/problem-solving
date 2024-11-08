package leetcode.twoSum;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSumApp {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = target - nums[i];
                if (sum == nums[j]) return new int[]{i, j};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two sum numbers: ");
        int[] nums = new int[]{scanner.nextInt()};
        System.out.println("Please enter target number: ");
        int target = scanner.nextInt();
        System.out.println(Arrays.toString(nums));
    }
}
