package self.quizzesExample;

import java.util.Arrays;

public class SortNumericArrayInAscendingApp {
    public static void main(String[] args) {
        // ascending
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("original array: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("sorted array: " + Arrays.toString(arr));
    }
}
