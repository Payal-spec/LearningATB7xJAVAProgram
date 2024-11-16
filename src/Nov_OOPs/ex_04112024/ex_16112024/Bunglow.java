package Nov_OOPs.ex_04112024.ex_16112024;

public class Bunglow extends Apartment{
    int rooms;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    @Override

    void colony(){
        System.out.println("Gokla society");
    }
}
