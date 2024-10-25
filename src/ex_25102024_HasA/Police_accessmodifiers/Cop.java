package ex_25102024_HasA.Police_accessmodifiers;

public class Cop {
    private int gun;
    private String copname;

    public Cop (int gun){
        this.gun =gun;
    }

    protected void shoot(){
        System.out.println("yes");
    }

}
