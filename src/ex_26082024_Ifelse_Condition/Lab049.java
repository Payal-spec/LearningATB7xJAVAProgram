package ex_26082024_Ifelse_Condition;

import java.util.Scanner;

public class Lab049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your score");
        int score = sc.nextInt();

        char    grade = 'F';

        if (score >= 90 && score<= 100){
            grade='A';
}else if (score>=80 && score<=90){
            grade='B';
        }else if (score>=70 && score <= 80){
            grade= 'C';
        }else if (score>= 60 && score <= 70){
            grade ='D';
        } else if (score>=50 && score <= 60) {
            grade= 'E';
        } else {
            grade ='H';
        }
        System.out.println("Your Grade is--"+grade);

        }

    }
