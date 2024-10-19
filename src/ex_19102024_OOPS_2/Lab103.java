package ex_19102024_OOPS_2;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Lab103 {
    public static void main(String[] args) {
        //Student S1 = new Student("Rita",20,987652353l);
       // S1.details();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String Sname = sc.next();
        System.out.println("Enter your age");
        int Sage = sc.nextInt();
        System.out.println("Enter your mobile number");
        Long Smob = sc.nextLong();

        Student S2 =new Student(Sname, Sage,Smob);
        S2.details();

        sc.close();


    }



}
