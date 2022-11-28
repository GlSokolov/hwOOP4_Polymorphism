public class DriverB extends Driver<PassengerCar>  {
    public DriverB(String fio, boolean driverLicense, int standing, PassengerCar car) {
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
