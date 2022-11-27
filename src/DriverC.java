public class DriverC <C extends FreightCar> extends Driver {
    public DriverC(String fio, boolean driverLicense, int standing) {
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

    public void getDriverInfo (C FreightCar) {
        System.out.println("Водитель " +getFio()+ " управляет автомобилем " +FreightCar.getBrand()+ " " +FreightCar.getModel()+ " и будет учасвтвовать в заезде");
    }
}
