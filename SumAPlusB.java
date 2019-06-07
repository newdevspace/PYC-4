/* Scanner guide. Explains what and in what order to type as input data
1 - first number
2 - second number
Then you'll get a sum of two typed numbers
 */
package MyStuff.Problems;

import java.util.Scanner;

public class SumAPlusB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int sum = x+y;
        System.out.println(sum);
    }
}
