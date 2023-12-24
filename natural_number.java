package important_40_qus;

import java.util.Scanner;

public class natural_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num= sc.nextInt(); //num = 3
        for (int i = 1; i <= num; i++)
        {
            System.out.println("natural number is  :" + i);
        }
    }
}