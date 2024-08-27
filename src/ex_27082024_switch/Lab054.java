package ex_27082024_switch;

import java.util.Scanner;

public class Lab054 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter browser");
        String browsername = sc.next();

        switch (browsername){
            case "Firefox":
                System.out.println("Start with Firefox");
                break;
            case "Chrome":
                System.out.println("Start with Chrome");
                break;
            case "Edge":
                System.out.println("Start with Edge");
                break;
            default:
                System.out.println("SHUT DOWN");
        }
    }
}
