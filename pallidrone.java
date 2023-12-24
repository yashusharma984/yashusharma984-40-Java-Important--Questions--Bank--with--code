package important_40_qus;
 // palodrone are those whose reverse is same 121--->121
import java.util.Scanner;

public class pallidrone {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number which you want to reverse");
        int num = sc.nextInt(); // 121
        int rev =0;
        int temp = num;
        while(num!=0)
        {
            int rem = num%10;
            rev = rev*10+rem;
            num= num/10;
        }
       num = temp;
        if(num == rev)
        {
            System.out.println(num + "is pallidrone");
        }
        else {
            System.out.println("no pallidrone");
        }
    }
}