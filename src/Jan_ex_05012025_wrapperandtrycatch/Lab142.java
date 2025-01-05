package Jan_ex_05012025_wrapperandtrycatch;

import java.util.Scanner;

public class Lab142 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if (age < 25) {
            try {
                throw new Exception("Not allowed");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("allowed");
        }
    }
}
