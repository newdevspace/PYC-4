package MyStuff.Problems;

import java.util.Scanner;
public class Rounding {
    public static int division(double a, double b) {
        double c = a/b;
        return (int)Math.round(Math.round(c * 100) / 100.0);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < num - 1; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            stb.append(Rounding.division(a, b));
            stb.append(' ');
        }
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        stb.append(Rounding.division(a, b));
        System.out.println(stb);
    }
}
