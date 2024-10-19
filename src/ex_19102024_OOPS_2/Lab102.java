package ex_19102024_OOPS_2;

import java.util.Scanner;

public class Lab102 {
    public static void main(String[] args) {
       // Bank B1 = new Bank();
        //System.out.println(B1.Bname);
        //System.out.println (B1.Bbal);
        //System.out.println(B1.Bcode);

        //Bank B2 = new Bank("icici",2,"icici2");

        //B2.printdetails();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Bank name");
        String Bname= sc.next();
        System.out.println("Enter your Bank balance");
        int Bbal = sc.nextInt();
        System.out.println("Enter your Bank code");
        String Bcode = sc.next();

        Bank B3 = new Bank(Bname,Bbal,Bcode);

        B3.printdetails();

        sc.close();








    }


}
