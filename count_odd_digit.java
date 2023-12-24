package important_40_qus;

import java.util.Scanner;

public class count_odd_digit {
    public static void main(String[] args)
    {Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int count=0;
        while(num>0)
        {
            int rem = num % 10;
            if (rem % 2 != 0)
            {
                count++;
            }
            num = num / 10;
        }
        System.out.println("digits count here " + count);
    }
}