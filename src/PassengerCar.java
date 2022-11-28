public class PassengerCar extends Car implements Competing{
    public PassengerCar(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }
    public void StartMove() {
        System.out.println("Поехали!");
    }
    public void EndMove() {
        System.out.println("Приехали!");
    }

    @Override
    public void pitStop() {
        System.out.println("Автомобиль:" + getBrand() + " " + getModel());
        System.out.println("Смена шин");
        System.out.println("Дозаправка топлива");
    }
    @Override
    public void bestLapTime(double timeLap) {
        System.out.println("Лучшее время круга "+getBrand()+" "+getModel()+" - "+timeLap+"мин.");
    }
    @Override
    public void maxSpeed(int maxSpeed) {
        System.out.println("Максимальная скорость "+getBrand()+" "+getModel()+" - "+maxSpeed+"км*ч");
    }
}
