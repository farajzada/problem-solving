package leetcode.concatenationOfArray;

import java.util.Arrays;
import java.util.Scanner;

public class ConcatenationOfArray {
    public static int[] getConcatenation(int[] nums) {
        int a = nums.length; //verdiyimiz arrayin uzunlugu
        int[] result = new int[2 * a]; //yeni yaradacagimiz arrayi 2*a olcusunde yaradirig


        for (int i = 0; i < a; i++) {
            result[i] = nums[i];
            //ilk elementi arraye elave edirik
        }

        for (int i = 0; i < a; i++) {
            result[a + i] = nums[i];
            //arraye yeniden elementleri elave edirik
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
}
