package ex_09112024_Polymorphism;

public class Lab112 {
    public static void main(String[] args) {
        Polymorphism P1= new Polymorphism();
        int result1 = P1.add(12,5);
        System.out.println(result1);
        double result2 = P1.add(12.5,8.8);
        float result3= P1.add(234567, 9876);
        String result4= P1.add("Poo", "Zoo",'A');
        System.out.println(result3);
        System.out.println(result2);
        System.out.println(result4);
}
}
