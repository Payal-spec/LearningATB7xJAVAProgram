package ex_17092024_arrays;

public class Lab097 {
    public static void main(String[] args) {
        int [] salary= {2,6,4,7,8,3,6};
        int max=1;
        for (int i=0; i<salary.length; i++) {
            if (salary[i] > max) {
                max = salary[i];

            }



        }System.out.println(max);
    }
}
