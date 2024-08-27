package ex_27082024_switch;

import java.util.Scanner;

public class Lab053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time from 1 to 4");
        int time = sc.nextInt();

        switch (time){
            case 1:
                System.out.println("wake");
                break;
            case 2:
                System.out.println("eat");
                break;
            case 3:
                System.out.println("run");
                break;
            case 4:
                System.out.println("sleep");
                break;
            default:
                System.out.println("Repeat");
        }
    }
}
