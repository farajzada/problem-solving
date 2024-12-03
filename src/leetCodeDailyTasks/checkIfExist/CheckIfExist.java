package leetCodeDailyTasks.checkIfExist;

import java.util.Arrays;

public class CheckIfExist {
    public static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] * 2 == arr[j] || arr[i] == 2 * arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkIfExist(new int[]{1, 2, 3, 4, 5}));
    }
}
