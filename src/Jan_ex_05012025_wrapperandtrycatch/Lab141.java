package Jan_ex_05012025_wrapperandtrycatch;

import java.util.Scanner;

public class Lab141 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if (age <18 ) {
            try {
                throw new Exception("Not allowed");
            } catch (Exception e) {
                throw new RuntimeException("under 18");
            }
        } else {
            System.out.println("Allowed");
        }
    }
}
