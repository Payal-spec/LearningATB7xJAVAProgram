package ex_23082024;

import java.util.Scanner;

public class Lab044 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter Number");
        int UserInput = S.nextInt();
        System.out.println(UserInput);

        if (UserInput % 5 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
