package important_40_qus;

import java.util.Scanner;

// vowel = a,e,i,o,u
public class vowel_constant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character");
        char ch = sc.next().charAt(0);
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("this is vowels");
        } else {
            System.out.println("constant");
        }
    }
}
