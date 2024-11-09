package self.quizzesExample;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortNumericArrayInDescending {
    public static void main(String[] args) {
        // descending array
        Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("Original Array : "+ Arrays.toString(arr));
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Sorted Array : "+ Arrays.toString(arr));

    }
}
