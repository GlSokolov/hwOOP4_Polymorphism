public class PassengerCar extends Car implements Competing{
    private BodyType bodyType;
    public PassengerCar(String brand, String model, double engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        setBodyType(bodyType);
    }
    public void StartMove() {
        System.out.println("Поехали!");
    }
    public void EndMove() {
        System.out.println("Приехали!");
    }

    public enum BodyType {
        SEDAN("Седан"), HATCHBACK("Хечбек"), COUPE("Купе"), UNIVERSAL("Универсал"), SUV("Внедорожник"), CROSSOVER("Кроссовер"), PICKUP("Пикап"), VAN("Фургон"), MINIVAN("Минивен");
        final String translate;
        BodyType(String translate) {
            this.translate = translate;
        }
    }

    @Override
    public void PrintType() {
        if (bodyType == null) {
        System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Автомобиль - " +getBrand()+ " "+getModel()+ " | Тип авто - " + bodyType);
        }
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

    public BodyType getBodyType() {
        return bodyType;
    }
    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }
}
