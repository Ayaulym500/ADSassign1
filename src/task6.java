//You are given numbers “a” and “n”, write the function that
//returns “an
//”.

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(function(a,b));
    }
    public static int function(int a, int b) {

        return (int) Math.pow(a,b);

    }
}
