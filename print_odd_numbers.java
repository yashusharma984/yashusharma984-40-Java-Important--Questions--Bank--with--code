package important_40_qus;

import java.util.Scanner;

public class print_odd_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt(); // n=6
        for (int i = 1; i <= num; i++)
        {
            if(i%2!=0)
            System.out.println("odd number : " + i);
        }
    }
}