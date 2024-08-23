package ex_23082024;

import java.util.Scanner;

public class Lab042 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter Number");
        int User_Input = S.nextInt();
        System.out.println(User_Input);

        if (User_Input % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
