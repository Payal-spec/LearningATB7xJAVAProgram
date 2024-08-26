package ex_26082024_Ifelse_Condition;

import java.util.Scanner;

public class Lab047 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your score");
        int score = Sc.nextInt();

        char grade = 'F';

        if (score>=90 && score<=100){
            grade = 'A';
        }else if (score>=80 && score<=90){
            grade = 'B';
        }else if (score>=90 && score<=70){
            grade ='C';
        }else if (score>=70 && score<=60){
            System.out.println("pass");

            }else{
            grade='F';
        }
        System.out.println("Your Grade is -"+grade);

        Sc.close();
    }}
