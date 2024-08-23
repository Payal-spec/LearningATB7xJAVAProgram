package ex_23082024;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class Lab043 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int UserInput = Sc.nextInt();
        System.out.println(UserInput);

        if (UserInput % 3 == 0) {
            System.out.println("Even");

        } else {
            System.out.println("Odd");
        }
    }
}
