package important_40_qus;

import java.util.Scanner;

// 153-->(1*1*1) +(5*5*5) + (3*3*3)
public class amstrong_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int count=0;
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            rev = (rem * rem * rem) + rev;
            {count++;}
            num = num / 10;
        }
        if (temp == rev) {
            System.out.println( rev + "amstrong number" + count);
        }
        else{
            System.out.println("no amstrong");
        }
    }
}