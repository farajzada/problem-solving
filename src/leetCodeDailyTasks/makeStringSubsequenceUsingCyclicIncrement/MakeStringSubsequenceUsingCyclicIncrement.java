package leetCodeDailyTasks.makeStringSubsequenceUsingCyclicIncrement;

import java.util.Scanner;

public class MakeStringSubsequenceUsingCyclicIncrement {
    public boolean canMakeSubsequence(String source, String target) {
        int targetIdx = 0, targetLen = target.length();

        for (char currChar : source.toCharArray()) {
            if (targetIdx < targetLen && (target.charAt(targetIdx) - currChar + 26) % 26 <= 1) {
                targetIdx++;
            }
        }
        return targetIdx == targetLen;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String source = scanner.nextLine();
        String target = scanner.nextLine();
        scanner.close();
        MakeStringSubsequenceUsingCyclicIncrement a = new MakeStringSubsequenceUsingCyclicIncrement();
        System.out.println(a.canMakeSubsequence(source, target));

    }
}
