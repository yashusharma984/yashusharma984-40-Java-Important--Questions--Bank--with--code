package important_40_qus;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number which you want to reverse");
        int num = sc.nextInt();
        int rev =0;
        while(num!=0)
        {
            int rem = num%10;
            rev = rev*10+rem;
            num= num/10;
        }
        System.out.println("number of  reverse  is : "  + rev);
    }
}