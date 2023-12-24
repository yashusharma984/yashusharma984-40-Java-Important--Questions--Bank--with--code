package important_40_qus;

import java.util.Scanner;

public class sum_num {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int sum=0;
        int count=0;
        while(num>0)
        {
            int rem = num % 10;
            sum = sum +rem;
            {
                count++;
            }
            num = num / 10;
        }
        System.out.println(count  + "sum of digits" + sum);
    }
}