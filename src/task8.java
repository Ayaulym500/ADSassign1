//You are given a string “s”, write the function for checking
//        whether “s” is all consists of digits.

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(check(s));
    }

    public static boolean check(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i)))
                return false;
            }

        return true;
    }
}
