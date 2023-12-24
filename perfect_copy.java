package important_40_qus;
// input --> 6 --> 123456
// rsult--> 123
import java.util.Scanner;

public class perfect_copy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to check perfect number");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
            if (num == sum) {
                System.out.println(" number is pefect  number ");
            }
            else{
                System.out.println("error");
            }
        }
    }
