package important_40_qus;

import java.util.Scanner;

public class digit_pallidroe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt(); // 121
        int temp = num;
        int count = 0;
        int rev=0;
        int r = 0;
        while (num != 0) {
            int rem = num % 10;
             rev = rev * 10 + rem;
            num = num / 10;
        }
        num = temp;
        if (num == rev)
        {
            System.out.println(num + " number is pallidrone");
            while (rev != 0)
            {
                r = rev % 10;
                count++;
                rev = rev / 10;
            }
            System.out.println("digit of pallidrone " + count);
        }
        else {
            System.out.println(num  +"is not pallidrone");
        }
    }
}