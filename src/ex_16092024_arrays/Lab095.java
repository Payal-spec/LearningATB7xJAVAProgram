package ex_16092024_arrays;

import java.util.Scanner;

public class Lab095 {
    public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
float[]score= new float[4];
        System.out.println("enter score 1");
        score[0]= sc.nextFloat();
        System.out.println("enter score 2");
        score[1]=sc.nextFloat();
        System.out.println("enter score 3");
        score[2]=sc.nextFloat();
        System.out.println("enter score 4");
        score[3]= sc.nextFloat();

        float avg= score[0]+score[1]+score[2]+score[3]/4;
        System.out.println("avg iss--"+ avg);

    }
}
