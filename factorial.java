package important_40_qus;

import java.util.Scanner;

// factorial 120--->12345
public class factorial {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int fact =1;
        for(int i=1;i<=num;i++)
        {
            fact = fact*i;
            System.out.print( i + " ");
        }
        System.out.println("the factorial of number" + fact);
    }
}