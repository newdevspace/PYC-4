package MyStuff.Problems;

import java.util.Scanner;

public class MaximumOfArray {
    public static void main(String[] args) {
        Scanner scanString = new Scanner(System.in);
        String test = scanString.nextLine();

        String[] integerStrings = test.split(" ");
        int[] integers = new int[integerStrings.length];

        int extrMin = 0;
        int extrMax = 0;

        for (int i = 0; i < integers.length; i++){
            integers[i] = Integer.parseInt(integerStrings[i]);
            if (integers[i] > extrMax){
                extrMax = integers[i];
            }
            if (integers[i] < extrMin){
                extrMin = integers[i];
            }
        }System.out.print(extrMax + " " + extrMin);
    }
}
