package leetcode.isSameAfterReversals;

import java.util.Scanner;

public class IsSameAfterReversalsApp {

    public  static boolean isSameAfterReversals(int num) {
        if (num == 0) return true; // 0
        if (num % 10 == 0) return false;

        return true;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(isSameAfterReversals(num));
    }

}
