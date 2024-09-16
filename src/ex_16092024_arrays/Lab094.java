package ex_16092024_arrays;

import java.util.Scanner;

public class Lab094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float []marks= new float[3];
        System.out.println("Enter mark 1");
        marks[0]=sc.nextFloat();
        System.out.println("Enter mark 2");
        marks[1]=sc.nextFloat();
        System.out.println("Enter mark 3");
        marks[2]=sc.nextFloat();

        float avg= marks[0] +marks[1]+marks[2]/3;
        System.out.println("AVg is--"+ avg);
    }
}
