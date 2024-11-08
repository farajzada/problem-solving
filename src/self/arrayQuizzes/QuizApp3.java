package self.arrayQuizzes;

import java.util.Scanner;

public class QuizApp3 {
    public static void main(String[] args) {

        // -------- task 3: write logic to insert a word and then reverse it with upper case --------

        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter the word : ");
        String word = scanner.nextLine();
        scanner.close();
        String reversedWord = new StringBuilder(word).reverse().toString().toUpperCase();
        System.out.println("The solution is : " + reversedWord);
    }
}
