package ex_29092024_OOPS;

import javax.xml.transform.Source;

public class Lab101 {
    public static void main(String[] args) {


        Javalearner J1 = new Javalearner("Gurguri");
        Javalearner J2 = new Javalearner("Payal");
        Javalearner J3 = new Javalearner("Poo",23456789);
        System.out.println(J1.name);
        System.out.println(J2.name);
        System.out.println(J3.name);
        System.out.println(J3.phone);


    }
}
