package leetcode.reverseInteger;

import java.util.Scanner;

public class ReverseIntegerApp {
    public static int reverse(int x) { //input:123 example
        int rev = 0; //0
        while (x != 0) { //p1 x:123 p2 x:12 p3 x:1 p3 x:0 (false)
            int pop = x % 10; // p1 pop:3 p2 pop:2 p3 pop:1
            x /= 10; // p1 x:12 p2 x:1 p3 x:0
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0; // rev:0 pop:3
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;  // rev:0 pop:3
            rev = rev * 10 + pop;// p1 rev:3 p2 rev:32 p3 rev:321
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(reverse(x));

    }

}



