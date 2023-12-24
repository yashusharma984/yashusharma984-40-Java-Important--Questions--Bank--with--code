package important_40_qus;

import java.util.Scanner;

// power = 5*5*5=125
public class power_num {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt(); // 5
        System.out.println("enter the power");
        int pow = sc.nextInt(); // 3
        int res=1;
        for(int i=1;i<=pow;i++)
        {
             res =res*num; // 1*5
        }
        System.out.println( " the power of " + num  + "is " + res);
    }
}