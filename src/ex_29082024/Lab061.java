package ex_29082024;

import java.util.Scanner;

public class Lab061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();

        System.out.println("Enter your age");
        int age = sc.nextInt();

        System.out.println("Enter your gender");
        char gender = sc.next().charAt(0);

        System.out.println("Your details are -" +name);
        System.out.println("Your details are -" +age);
        System.out.println("Your details are -" +gender);
    }
}
