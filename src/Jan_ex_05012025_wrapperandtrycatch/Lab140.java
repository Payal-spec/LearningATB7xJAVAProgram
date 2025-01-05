package Jan_ex_05012025_wrapperandtrycatch;

import java.util.Scanner;

public class Lab140 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your gender");
        String gender = sc.next();
        if (gender.equalsIgnoreCase("male")){
            try {
                throw new Exception("You are not allowed");
            } catch (Exception e) {
                throw new RuntimeException(e);

            }
        } else {
            System.out.println("Allowed");
        }

        }

    }

