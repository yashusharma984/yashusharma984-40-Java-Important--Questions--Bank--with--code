package important_40_qus;

import java.util.Scanner;

public class reverse_count {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number which want to reverse");
        int num = sc.nextInt();
        int rev =0;
        int count=0;
        while(num!=0)
        {
            int rem = num%10;
            rev = rev*10 + rem;
            { count++; } // for count the number
            num = num/10;
        }
        System.out.println("count digit here  " + count );
        System.out.println("reverse numbe here " + rev);
    }
}