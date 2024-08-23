package ex_23082024;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Lab041 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.println("Enter No1");
        int No1 = S.nextInt();

        System.out.println("Enter No2");
        int No2 = S.nextInt();

        System.out.println(Math.max(No1, No2));
    }
}
