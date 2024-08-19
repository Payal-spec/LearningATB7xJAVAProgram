package ex_19082024;

import java.util.Scanner;

public class Lab039 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Num1");
        int Num1= s.nextInt();

        System.out.println("Enter Num2");
        int Num2=s.nextInt();

        System.out.println(Math.max(Num1,Num2));
    }
}
