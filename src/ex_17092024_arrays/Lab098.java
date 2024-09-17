package ex_17092024_arrays;

public class Lab098 {
    public static void main(String[] args) {
int[] p={2,6,3,9,4};
int max=1;
for (int i=0; i<p.length;i++){
    if (p[i]> max){
        max= p[i];
    }
}
        System.out.println(max);
    }
}
