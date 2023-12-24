package important_40_qus;

import java.util.Scanner;

//even = 10[2,4,6,8,10]
// odd =10[1,3,5,7,9]
public class sum_even_odd {
    public static void main(String[] args)
    {
      Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int sum=0;
        if(num%2==0)
        {
            for(int i =0;i<=num;i=i+2)
            {
                sum = sum+i;
            }
                System.out.println("sum of even number : " + sum);
            }
        else
        {
            for(int i=1;i<=num;i=i+2)
            {
                sum =sum+i;
            }
            System.out.println("sum of odd numbers : " + sum);
        }
    }
}