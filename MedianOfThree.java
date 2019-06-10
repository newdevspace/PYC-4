package MyStuff.Problems;

import java.util.Scanner;

public class MedianOfThree {
    public static int median(int a, int b, int c) {
        if ((a < b && a > c) || (a < c && a > b)) {
            return a;
        }else if ((c > b && c < a) || (c > a && c < b)){
            return c;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            stb.append(median(a, b, c)).append(' ');
        }

        System.out.println();
        System.out.println(stb);
    }
}
