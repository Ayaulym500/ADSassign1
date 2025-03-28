
import java.util.Scanner;

//You are given a number “n” and an array of “n” elements,
//write the program that returns given array in reverse order
//without using array data structure.

public class task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        reverse(arr,  n- 1);
    }

    public static void reverse(int[] arr, int n) {
        if (n < 0) {
            return;
        }
        System.out.print(arr[n] + " ");
        reverse(arr, n- 1);
    }
}