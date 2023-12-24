package important_40_qus;

import java.util.Scanner;

public class product {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number for product");
        int num = sc.nextInt();
        int product=1;
        while(num>0)
        {
            int rem = num % 10;
            product= product *rem;
            num = num / 10;
        }
        System.out.println("product of digits" + product);
    }
}