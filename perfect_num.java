package important_40_qus;

import java.util.Scanner;

public class perfect_num {
    public static void main(String[] args)
    { Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum= 0;
        for (int i = 1; i <num; i++) {
            if (num % i == 0)
            {
              sum = sum +i;
            }
        }
        if (num==sum) {
            System.out.println("perfect number");
        } else {
            System.out.println("invalid");
        }
    }
}
