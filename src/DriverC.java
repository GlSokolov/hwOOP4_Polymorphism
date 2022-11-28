public class DriverC extends Driver<FreightCar> {
    public DriverC(String fio, boolean driverLicense, int standing, FreightCar car) {
        super(fio, driverLicense, standing, car);
    }

    @Override
    public void StartMove() {
        System.out.println("Водитель " + getFio() + " заправляется");
    }
    @Override
    public void EndMove() {
        System.out.println("Водитель " + getFio() + " остановился");
    }
    @Override
    public void refuel() {
        System.out.println("Водитель " + getFio() + " поехал");
    }

}
