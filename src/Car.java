public abstract class Car <D extends Driver> {
    private String brand;
    private String model;
    private double engineVolume;


    public Car (String brand, String model, double engineVolume) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
    }

    public abstract void StartMove();
    public abstract void EndMove();
    public abstract void PrintType();
    public abstract String GetDiagnosed(D driver);

    public double getEngineVolume() {
        return engineVolume;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }

    public void setBrand(String brand) {
        if (brand == null && brand.isEmpty() && brand.isBlank()) {
            this.brand = "<Информация не указана>";
        } else {this.brand = brand; }
    }
    public void setModel(String model) {
        if (model == null && model.isEmpty() && model.isBlank()) {
            this.model = "<Информация не указана>";
        } else {this.model = model; }
    }
    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0 ) {
            this.engineVolume = 1.0;
        } else {
            this.engineVolume = engineVolume;}
    }

    @Override
    public String toString() {
        return "Car: [" +
                "Брэнд - " + brand +
                ", Марка - " + model +
                ", Обьем двигателя - " + engineVolume +
                "л.]";
    }

}

