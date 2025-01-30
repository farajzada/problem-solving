package leetcode.numberOfGoodPairs;

public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (num == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        NumberOfGoodPairs numberOfGoodPairs = new NumberOfGoodPairs();
        System.out.println(numberOfGoodPairs.numIdenticalPairs(nums));
    }
}
