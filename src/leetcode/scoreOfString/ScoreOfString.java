package leetcode.scoreOfString;

public class ScoreOfString {
    public static int scoreOfParentheses(String s) {
        int score = 0;
        int depth = 0; // cari derinlik

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                depth++; //  acig moterizenin derinliyini artiririg
            } else {
                depth--; //baglanis moterizesinin derinliyini artiririg
                if (s.charAt(i - 1) == '(') {
                    score += 1 << depth; // 2^depth  scorenu elave edirik
                }
            }
        }

        return score;
    }

    public static void main(String[] args) {
        String s = "(()(()))"; // test
        System.out.println("Sətirin skoru: " + scoreOfParentheses(s));
    }
}
