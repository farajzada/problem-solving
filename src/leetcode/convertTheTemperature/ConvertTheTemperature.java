package leetcode.convertTheTemperature;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertTheTemperature {
    public static double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;
        return new double[]{kelvin, fahrenheit};
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(Arrays.toString(convertTemperature(a)));
    }
}
