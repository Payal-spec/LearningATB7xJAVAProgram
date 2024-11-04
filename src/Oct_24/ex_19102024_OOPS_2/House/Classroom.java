package Oct_24.ex_19102024_OOPS_2.House;

import java.util.Scanner;

public class Classroom {
    public static void main(String[] args) {
        //Class C1 = new Class(7, "Sam");
        //System.out.println(C1.standard);
        //System.out.println(C1.studentname);
        //C1.permission();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your standard");
        int CS = sc.nextInt();
        System.out.println("Enter your name");
        String SN = sc.next();

        Class C2 = new Class(CS,SN);
        C2.permission();

    }
}
