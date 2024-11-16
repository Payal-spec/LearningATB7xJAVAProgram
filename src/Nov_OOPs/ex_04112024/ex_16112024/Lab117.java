package Nov_OOPs.ex_04112024.ex_16112024;

public class Lab117 {
    public static void main(String[] args) {
        Apartment A = new Apartment();
        A.colony();
        Bunglow B= new Bunglow();
        B.colony();
        B.setRooms(4);
        B.setName("Shefali");
        System.out.println(B.name);
        System.out.println(B.rooms);;
        Apartment AB= new Bunglow();
        AB.colony();
    }
}
