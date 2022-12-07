public abstract class Driver {
    private String fio;
    private boolean driverLicense;
    private int standing;
    private String  category;

    public Driver(String fio, boolean driverLicense, int standing, String category) {
        setFio(fio);
        setDriverLicense(driverLicense);
        setStanding(standing);
        setCategory(category);
    }

    public abstract void StartMove();
    public abstract void EndMove();
    public abstract void refuel();

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

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        if (category == null || category.isEmpty() || category.isBlank()) {
            throw new IllegalArgumentException("Необходимо указать категорию водителя!");
        } else {
            this.category = category;
        }
    }
}

