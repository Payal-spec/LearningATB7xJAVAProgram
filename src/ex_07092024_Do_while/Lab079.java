package ex_07092024_Do_while;

import java.util.Scanner;

public class Lab079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) ;
        if (num % 2 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (num % 2 == 0) {
            System.out.println("Fizz");

        } else if (num % 5 == 0) {
            System.out.println("Buzz");

        } else {
            System.out.println(num);

        }
    }
}
