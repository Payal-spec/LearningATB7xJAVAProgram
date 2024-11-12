package ex_12112024_overridding_overloading;

public class Student extends Person {

    @Override
    void message(){
        System.out.println("I'm a student");

    }
    void display(){
        super.message();
    }
}
