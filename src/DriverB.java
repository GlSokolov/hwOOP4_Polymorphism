public class DriverB <B extends PassengerCar> extends Driver {
    public DriverB(String fio, boolean driverLicense, int standing) {
        super(fio, driverLicense, standing);
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

    public void getDriverInfo (B PassengerCar) {
        System.out.println("Водитель " +getFio()+ " управляет автомобилем " +PassengerCar.getBrand()+ " " +PassengerCar.getModel()+ " и будет учасвтвовать в заезде");
    }
}
