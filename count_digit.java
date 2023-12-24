package important_40_qus;
// count =3456-->4
import java.util.Scanner;

public class count_digit {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt(); // 3456
        int count=0;
       while (num!=0)
        {
            num=num/10;
            count++;
        }
        System.out.println(" count digit here " + count); // 4
    }
}