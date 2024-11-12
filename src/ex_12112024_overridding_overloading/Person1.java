package ex_12112024_overridding_overloading;

public class Person1 {
    public Person1() {
        System.out.println("Person DC");
    }

    public Person1(String a) {
        System.out.println("Person1 PC");
    }

    public Person1(int a, int b) {
        System.out.println("Person2 PC");

    }
}

class Student1 extends Person1{
    Student1 (String s){
        System.out.println("Student PC");
    }

    Student1(){
        //super("Poozoo");
        //super(12,34);
        this("Poo");


    }
}
