package Nov_OOPs.ex_04112024.ex_16112024;

abstract class Car extends Engine  {

    @Override
    void start() {
        System.out.println("Start the car");

    }

    @Override
    void stop() {
        System.out.println("Stop the car");

    }

    @Override
    void Gearboxparts() {
        System.out.println("Parts of GB");

    }

    @Override
    void opencar() {
        System.out.println("open the car");

    }
}
