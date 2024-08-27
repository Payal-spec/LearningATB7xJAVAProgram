package ex_27082024_switch;

import java.util.Scanner;

public class Lab052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day from 1 to 5");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Sun");
                break;
            case 2:
                System.out.println("Mon");
                break;
            case 3:
                System.out.println("Tue");
                break;
            case 4:
                System.out.println("Wed");
                break;
            case 5:
                System.out.println("Thurs");
                break;
            default:
                System.out.println("No idea");

    }
}}
