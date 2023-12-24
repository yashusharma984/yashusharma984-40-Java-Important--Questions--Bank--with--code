package important_40_qus;

import java.util.Scanner;

public class swap {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int temp =0;
        System.out.println("before swapping " + num1  +"is " + num2);
         temp = num1;
         num1 = num2;
         num2=temp;
        System.out.println("after swapping " + num1  +"is " + num2);
    }
}