package Nov_OOPs.ex_04112024.ex_16112024;

public class Tesla extends Car{
  void drive(){
      opencar();
      start();
      Gearboxparts();
      speed();
      stop();
    }

    @Override
    void start() {
        super.start();
    }

    @Override
    void stop() {
        super.stop();
    }

    @Override
    void Gearboxparts() {
        super.Gearboxparts();
    }

    @Override
    void opencar() {
        super.opencar();
    }

    @Override
    void speed() {
        System.out.println("120km/hr");

    }
}
