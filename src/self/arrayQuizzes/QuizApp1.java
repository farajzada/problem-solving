package self.arrayQuizzes;

import java.util.Scanner;

public class QuizApp1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        // -------- task 1: write a logic insert a word using Scanner --------
        System.out.print("please enter the number : ");
        String number = scanner.nextLine();
        char lastCharacter = number.charAt(number.length() - 1);
        System.out.println("the last character is " + lastCharacter);


    }
}
