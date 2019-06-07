package MyStuff.Problems;

import java.util.Scanner;
public class MinimumOfThree {
    public static int min(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        }else if (c < b && c < a){
            return c;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < num - 1; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            stb.append(MinimumOfThree.min(a, b, c));
            stb.append(' ');
        }
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        stb.append(MinimumOfThree.min(a, b, c));
        System.out.println(stb);
    }
}
