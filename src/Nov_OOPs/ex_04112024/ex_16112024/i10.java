package Nov_OOPs.ex_04112024.ex_16112024;

public class i10 extends Car{
    void drivei10(){
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
        System.out.println("100km/hr");

    }
}
