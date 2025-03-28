//You are given a number “n”, write the function for finding n-th
//elements in Fibonacci sequence using recursion. (Fn = Fn-1+ Fn-2).
//F0= 0, F1 = 1.

import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println( fib(n));
    }


    public static int fib(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }
}

