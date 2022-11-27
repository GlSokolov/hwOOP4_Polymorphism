public class DriverD <D extends Bus> extends Driver {
    public DriverD(String fio, boolean driverLicense, int standing) {
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

    public void getDriverInfo (D Bus) {
        System.out.println("Водитель " +getFio()+ " управляет автомобилем " +Bus.getBrand()+ " " +Bus.getModel()+ " и будет учасвтвовать в заезде");
    }
}
