

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(binomialCoefficient(n, m));
    }
    public static int binomialCoefficient(int n, int m) {
        if (m == 0 || m == n)
            return 1;
        return binomialCoefficient(n - 1, m - 1) + binomialCoefficient(n - 1, m);
    }
}

