package important_40_qus;

import java.util.Scanner;

public class palllidrone_copy {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int rev=0;
        int count =0;
        int temp =num;
        while(num!=0)
        {
            int rem = num%10;
            rev= rev*10 + rem;
            {count++;}
            num =num/10;
        }
        num= temp;
        if(num==rev)
        {
            System.out.println(num + " it is pallidrone and" +
                    " count digit is " + count );
        }
        else {
            System.out.println(num + " it is not pallidorne");
        }
    }
}