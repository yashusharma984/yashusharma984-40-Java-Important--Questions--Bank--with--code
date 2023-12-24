package important_40_qus;

import java.util.Scanner;

public class amsrtong {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the nuber which you want to see in asmtrong");
        int num = sc.nextInt(); // 153
        int temp= num;
        int rev=0;
        while(num!=0)
        {
            int rem = num%10;
            rev = (rem*rem*rem) + rev;
            num = num/10;
        }
        if(temp== rev)
        {
            System.out.println( rev + " number is  amstrong");
        }
        else{
            System.out.println("number is not amstrong");
        }
    }
}