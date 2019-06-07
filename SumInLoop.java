package MyStuff.Problems;

import java.util.Scanner;

public class SumInLoop {
    public static void main(String[] args) {
        int n, sum = 0;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }System.out.println(sum);
    }}