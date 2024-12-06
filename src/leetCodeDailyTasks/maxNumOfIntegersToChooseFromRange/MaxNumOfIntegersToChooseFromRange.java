package leetCodeDailyTasks.maxNumOfIntegersToChooseFromRange;

import java.util.Scanner;

public class MaxNumOfIntegersToChooseFromRange {
    public int maxCount(int[] banned, int n, int maxSum) {
        boolean[] isBanned = new boolean[10001];
        for (int b : banned) {
            if (b <= n) {
                isBanned[b] = true;
            }
        }

        int count = 0;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (!isBanned[i] && sum + i <= maxSum) {
                sum += i;
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MaxNumOfIntegersToChooseFromRange maxNumOfIntegersToChooseFromRange = new MaxNumOfIntegersToChooseFromRange();

        System.out.println("Enter the banned numbers separated by spaces:");
        String[] bannedInput = scanner.nextLine().split(" ");
        int[] banned = new int[bannedInput.length];
        for (int i = 0; i < bannedInput.length; i++) {
            banned[i] = Integer.parseInt(bannedInput[i]);
        }

        System.out.println("Enter n:");
        int n = scanner.nextInt();

        System.out.println("Enter maxSum:");
        int maxSum = scanner.nextInt();

        int result = maxNumOfIntegersToChooseFromRange.maxCount(banned, n, maxSum);
        System.out.println("Maximum number of integers: " + result);

        scanner.close();
    }
}
