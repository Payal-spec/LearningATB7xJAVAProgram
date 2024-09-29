package ex_29092024_OOPS;

public class Javalearner {
    String name;
     Long phone;
    Javalearner(){
        System.out.println("created");
    }
    Javalearner(String namegiven){
        this.name = namegiven;

    }
    Javalearner(String namegiven, long phonenmbr){
        this.name = namegiven;
        this.phone = phonenmbr;}

}
