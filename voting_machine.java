package important_40_qus;

import java.util.Scanner;

public class voting_machine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("check the age for voting");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("you are eligible for voting");
        } else {
            System.out.println("dudu piyo soo jao");
        }
    }
}