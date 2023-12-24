package important_40_qus;

import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("even number : " + num);
        } else if (num % 2 != 0) {
            System.out.println("odd number : " + num);

        } else {
            System.out.println();
        }
    }
}