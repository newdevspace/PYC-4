package MyStuff.Problems;
import java.util.Scanner;

public class FahrenheitToCelsius {
    public static int convert(int a) {
        double b = (a-32.0)*(5.0/9.0);
        return (int)Math.round(b);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] nums = new int[num];
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < num; i++) {
            nums[i] = FahrenheitToCelsius.convert(in.nextInt());
            st.append(nums[i]);
            if (i < num - 1) {
                st.append(' ');
            }
        }
        String str = st.toString();
        System.out.println(str);
    }
}

