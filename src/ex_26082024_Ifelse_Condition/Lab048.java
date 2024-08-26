package ex_26082024_Ifelse_Condition;

import java.util.Scanner;

public class Lab048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks = sc.nextInt();

        char grade = 'F';

        if (marks>=90 && marks<=100){
            grade = 'A';
        } else if (marks>=80 && marks<=90) {
            grade = 'B';
        } else if (marks>=70 && marks<=80) {
            grade = 'C';

        }else{
            grade='F';


    } System.out.println("Your Grade is"+grade);

        sc.close();

    }
}
