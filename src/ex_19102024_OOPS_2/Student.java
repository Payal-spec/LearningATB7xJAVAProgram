package ex_19102024_OOPS_2;

public class Student {

    String Sname;
    int Sage;
    Long Smob;

    Student (String name, int age, Long mob){
        this.Sname =name;
        this.Sage = age;
        this.Smob = mob;
    }

    void details (){
        System.out.println("Student's name->"+ Sname);
        System.out.println("Student's age->"+ Sage);
        System.out.println("Student's mobile no->" +Smob);
    }
}
