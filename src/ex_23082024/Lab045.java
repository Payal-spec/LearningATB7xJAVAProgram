package ex_23082024;

import java.util.Scanner;

public class Lab045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num 1");
        int Num1 = sc.nextInt();

        System.out.println("Enter Num 2");
        int Num2 = sc.nextInt();

        System.out.println(Math.max(Num1, Num2));
        if (Num1 > Num2) {
            System.out.println(Num1);
        } else if (Num1 < Num2) {
            System.out.println(Num2);
        } else {
            System.out.println("Equal");
        }
    }
}
