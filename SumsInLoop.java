package MyStuff.Problems;

import java.util.Scanner;

public class SumsInLoop {
    public static int sum(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] nums = new int[num];
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < num; i++) {
            nums[i] = SumsInLoop.sum(in.nextInt(), in.nextInt());
            st.append(nums[i]);
            if (i < num - 1) {
                st.append(' ');
            }
        }
        String str = st.toString();
        System.out.println(str);
    }
}