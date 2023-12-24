package important_40_qus;

import java.util.Scanner;

public class sum_natural_number {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num= sc.nextInt(); // num =3
        int sum =0;
        for(int i=1;i<=num;i++)
        {
            sum = sum + i;
        }
            System.out.println("natural number sum :" + sum);
        }
    }
