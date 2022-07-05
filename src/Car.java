public class Car {
    private String brand;
    private String model;
    private int constructionYear;
    private int power;
    private String transmission;
    private int numberOfSeats;

    public Car() {
        //
    }

    public Car(Car car) {
        this.brand = car.brand;
        this.model = car.model;
        this.constructionYear = car.constructionYear;
        this.power = car.power;
        this.transmission = car.transmission;
        this.numberOfSeats = car.numberOfSeats;
    }

    public static void Replace(Car carX, Car carY) {
        String brandTemp = carX.brand;
        String modelTemp = carX.model;
        int powerTemp = carX.power;
        String transmissionTemp = carX.transmission;
        int numberOfSeatsTemp = carX.numberOfSeats;
        carX.brand = carY.brand;
        carX.model = carY.model;
        carX.power = carY.power;
        carX.transmission = carY.transmission;
        carX.numberOfSeats = carY.numberOfSeats;
        carY.brand = brandTemp;
        carY.model = modelTemp;
        carY.power = powerTemp;
        carY.transmission = transmissionTemp;
        carY.numberOfSeats = numberOfSeatsTemp;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand.isEmpty() ? "Garage made" : brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model.isEmpty() ? "Model 1" : model;
    }

    public int getConstructionYear() {
        return constructionYear;
    }

    public void setConstructionYear(int constructionYear) {
        this.constructionYear = constructionYear > 0 ? constructionYear : 2000;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power > 0 ? power : 100;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission.isEmpty() ? "Shiftless transmission" : transmission;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats > 0 ? numberOfSeats : 1;
    }
}
