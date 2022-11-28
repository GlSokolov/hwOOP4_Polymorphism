public class Driver<D extends Car> {
    private String fio;
    private boolean driverLicense;
    private int standing;
    private final D car;

    public Driver(String fio, boolean driverLicense, int standing, D car) {
        setFio(fio);
        setDriverLicense(driverLicense);
        setStanding(standing);
        this.car = car;
    }

    public void StartMove() {
        System.out.println("Водитель " + getFio() + " заправляется");
    }
    public void EndMove() {
        System.out.println("Водитель " + getFio() + " остановился");
    }
    public void refuel() {
        System.out.println("Водитель " + getFio() + " поехал");
    }

    public String getFio() {
        return fio;
    }
    public void setFio(String fio) {
        if (fio == null || fio.isEmpty() || fio.isBlank()) {
            this.fio = " <Некорректное значение> ";
        } else {
        this.fio = fio;}
    }
    public boolean isDriverLicense() {
        return driverLicense;
    }
    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }
    public int getStanding() {
        return standing;
    }
    public void setStanding(int standing) {
        if (standing<0) {
            this.standing = 0;
        } else {
        this.standing = standing;}
    }

    @Override
    public String toString() {
        return "Водитель " +getFio()+ " управляет автомобилем " +this.car.getBrand()+ " " +this.car.getModel()+ " и будет учасвтвовать в заезде";
    }
}
