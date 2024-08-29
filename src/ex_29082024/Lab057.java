package ex_29082024;

import java.util.Scanner;

public class Lab057 {


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter word");
    char word = sc.next().charAt(0);

    switch (word) {
        case 'a':
            System.out.println("Vowel");
            break;
        case 't':
            System.out.println("Consonant");
            break;
        default:
            System.out.println("Word");


    }
}}
