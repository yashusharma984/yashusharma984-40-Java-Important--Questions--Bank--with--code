package important_40_qus;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number first");
        int n1 = sc.nextInt();
        System.out.println("enter the number second");
        int n2=sc.nextInt();
        System.out.println("which operation you perform");
       char ch = sc.next().charAt(0);
        int cal =0;
        if(ch == '-')
        {
            cal =  n1-n2;
            System.out.println("subtraction here " + cal);
        } else if (ch=='+')
        {
         cal =n1+n2;
            System.out.println("addition " + cal);
        } else if (ch == '/') {
            cal = n1/n2;
            System.out.println("divide " + cal);
        } else if (ch=='*') {
            cal =n1*n2;
            System.out.println("multiply " + cal);
        }
    }
}