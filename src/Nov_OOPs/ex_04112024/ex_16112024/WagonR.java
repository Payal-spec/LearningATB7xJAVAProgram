package Nov_OOPs.ex_04112024.ex_16112024;

public class WagonR extends Engine{
    void drivewagon(){
        opencar();
        start();
        Gearboxparts();
        speed();
        stop();
    }

    @Override
    void start() {
        System.out.println("staring wagonR");

    }

    @Override
    void stop() {
        System.out.println("stopping wagonR");

    }

    @Override
    void speed() {
        System.out.println("Speed of wagonR is 180");

    }

    @Override
    void Gearboxparts() {
        System.out.println("Part of wagonR");

    }

    @Override
    void opencar() {

        System.out.println("open wagonR");

    }
}
