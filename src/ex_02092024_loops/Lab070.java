package ex_02092024_loops;

public class Lab070 {
    public static void main(String[] args) {
        for (int i=0; i<10; i++){
            System.out.println(i);
            if (i==5){
                continue;
            }
            System.out.println("after");
        }
    }
}
