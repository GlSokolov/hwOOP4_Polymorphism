public class Bus extends Car {
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public void StartMove() {
        System.out.println("Поехали!");
    }
    public void EndMove() {
        System.out.println("Приехали!");
    }
}
