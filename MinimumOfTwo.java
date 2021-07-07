package MyStuff.Problems;

import java.util.Scanner;
public class MinimumOfTwo {
    public static int min(int a, int b) {
        if (a < b) {
            return a;
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
            stb.append(MinimumOfTwo.min(a, b));
            stb.append(' ');
        }
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        stb.append(MinimumOfTwo.min(a, b));
        System.out.println(stb);
    }
}
