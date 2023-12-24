package important_40_qus;

import java.util.Scanner;

public class count_between_palidrone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int rem = 0;
        int c = 0;
        int count = 0;
        for (int i = num1; i < num2; i++)
        {
            c = i;
            int rev = 0;
            while (c > 0)
            {
                rem = c % 10;
                rev = rev * 10 + rem;
                c = c / 10;
            }
            if (rev == i)
            {
                count++;
            }
            System.out.println(count);
        }
    }
}
