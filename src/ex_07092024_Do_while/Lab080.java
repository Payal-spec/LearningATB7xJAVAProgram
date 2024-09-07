package ex_07092024_Do_while;

import java.util.Scanner;

public class Lab080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Num");
        int Num = sc.nextInt();
        for (int i = 1; i <= Num; i++) ;
        if (Num % 2 == 0 && Num % 3 == 0) {
            System.out.println("Fizzbuzz");
        } else if (Num % 2 == 0) {
            System.out.println("Fizz");
        } else if (Num % 3 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(Num);
        }
    }
}
