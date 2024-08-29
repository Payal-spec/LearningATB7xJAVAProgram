package ex_29082024;

import java.util.Scanner;

public class Lab062 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("Positive");

        } else if (number < 0) {
            System.out.println("Negative");

        } else {
            System.out.println("Zero");
        }
    }
}
