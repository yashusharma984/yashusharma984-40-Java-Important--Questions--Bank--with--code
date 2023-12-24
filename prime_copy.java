package important_40_qus;

import java.util.Scanner;

// those num divide by itself or 1 that number is called prime number
public class prime_copy {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int count=0;
        for(int i =1;i<=num;i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if(count==2){
                    System.out.println("prime number");
                }
            }
        }
