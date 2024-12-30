package leetcode.excellSheetColumnNumber;

public class ExcellSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (char c : columnTitle.toCharArray()) {
            result = result * 26 + (c - 'A' + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        ExcellSheetColumnNumber excellSheetColumnNumber = new ExcellSheetColumnNumber();
        System.out.println(excellSheetColumnNumber.titleToNumber("A"));
        System.out.println(excellSheetColumnNumber.titleToNumber("AB"));
        System.out.println(excellSheetColumnNumber.titleToNumber("ZY"));
        System.out.println(excellSheetColumnNumber.titleToNumber("FXSHRXW"));


    }
}
