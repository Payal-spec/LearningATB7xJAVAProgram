package ex_14112024;

public class Lab116 {



    class metro extends train{
     public    int spd= 180;

        @Override

        void msg(){
            System.out.println("This is metro");

        }
        void displayy(){
            System.out.println("the speed is->"+ super.spd);
            System.out.println("the speed is->"+ this.spd);

        }
    }

     class train {
      public   int spd = 100;

        void msg(){
            System.out.println("This is train");
        }

    }



}
