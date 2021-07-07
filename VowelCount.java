package MyStuff.Problems;

import java.util.Scanner;
public class VowelCount {
    public static int vowelCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'y') {
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            String a = scanner.nextLine();
            stb.append(VowelCount.vowelCount(a));
            stb.append(' ');
        }
        String a = scanner.nextLine();
        stb.append(VowelCount.vowelCount(a));
        System.out.print(stb.substring(2));
    }
}
