package leetCodeDailyTasks.AddingSpacesToString;

import java.util.Scanner;

public class AddingSpacesToStringApp {
    public String addSpaces(String s, int[] spaces) {

        int n = s.length();
        int m = spaces.length;
        char[] chrs = new char[n + m];

        int j = 0;
        for (int i = 0; i < n; i++) {
            if (j < m && i + j == spaces[j] + j) {
                chrs[i + j] = ' ';
                j++;
            }
            chrs[i + j] = s.charAt(i);
        }

        return new String(chrs);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("String daxil edin:");
        String s = scanner.nextLine();

        System.out.println("Boşluq indekslərinin sayını daxil edin:");
        int m = scanner.nextInt();

        int[] spaces = new int[m];
        System.out.println("Boşluq indekslərini ardıcıl daxil edin:");
        for (int i = 0; i < m; i++) {
            spaces[i] = scanner.nextInt();
        }

        AddingSpacesToStringApp app = new AddingSpacesToStringApp();
        String result = app.addSpaces(s, spaces);

        System.out.println("Nəticə:");
        System.out.println(result);

        scanner.close();
    }

}
