package ex_27082024_switch;

import java.util.Scanner;

public class Lab055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Browser");
        String browsername = sc.next();
        browsername = browsername.toLowerCase();

        switch (browsername){
            case "safari":
                System.out.println("Open Safari");
                break;
            case "ventura":
                System.out.println("Open Ventura");
                break;
            default:
                System.out.println("Shut Down");

        }
    }
}
