package self.arrayQuizzes;

import java.util.Scanner;

public class QuizApp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // -------- task 2: write a logic insert a word and check if the last character is a vowel --------

        System.out.print("please enter the word : ");
        String word = scanner.nextLine();

        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        char lastCharacter = word.charAt(word.length() - 1);
        boolean isVowel = false;
        for (int i = 0; i < vowels.length; i++) {
            if(lastCharacter == vowels[i]){
                isVowel = true;
                break;
            }
        }

        if (isVowel) System.out.println("Last symbol is vowel");
        else System.out.println("Last symbol is not vowel");


    }
}
