package ex_14112024;

public class Truck extends Bus{

     int speed = 200;

    void display(){
        System.out.println("your speed is" + this.speed);
        System.out.println("Your speed is"+ super.speed);
    }

    public static void main(String[] args) {
        Truck T = new Truck();
        T.display();

    }

}
