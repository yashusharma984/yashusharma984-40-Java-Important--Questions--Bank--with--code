package important_40_qus;

import java.util.Scanner;

public class between_prime {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number one");
        int n1 = sc.nextInt();
        System.out.println("enter the number second");
        int n2 = sc.nextInt();
        int j=0;
        for(int i =n1;i<=n2;i++)
        {
            for( j=2;j<=i;j++)
            {
                if(i%j==0)
                    break;
            }
            if(i ==j)
                System.out.println(j);
        }
    }
}