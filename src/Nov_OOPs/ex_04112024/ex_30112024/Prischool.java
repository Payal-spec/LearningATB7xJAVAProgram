package Nov_OOPs.ex_04112024.ex_30112024;

public interface Prischool  {
    void teacher (String name);
    default void fame (){
        System.out.println("Alumni of the school");
    }
}
