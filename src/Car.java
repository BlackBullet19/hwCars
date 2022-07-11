public class Car {

    private static final int DEFAULT_CONSTRUCTION_YEAR = 2000;
    private static final int DEFAULT_POWER = 100;
    private static final int DEFAULT_NUMBER_OF_SEATS = 1;
    private static final String DEFAULT_BRAND = "Сделанно в гараже";
    private static final String DEFAULT_MODEL = "Модель номер 1";
    private static final String DEFAULT_TRANSMISSION = "Без скоростная КПП";

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

    public static void replace(Car carX, Car carY) {
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
        if (brand != null) {
            this.brand = brand.isEmpty() ? DEFAULT_BRAND : brand;
        } else {
            this.brand = DEFAULT_BRAND;
        }
        return brand;
    }

    public void setBrand(String brand) {
        if (brand != null) {
            this.brand = brand.isEmpty() ? DEFAULT_BRAND : brand;
        } else {
            this.brand = DEFAULT_BRAND;
        }
    }

    public String getModel() {
        if (model != null) {
            this.model = model.isEmpty() ? DEFAULT_MODEL : model;
        } else {
            this.model = DEFAULT_MODEL;
        }
        return model;
    }

    public void setModel(String model) {
        if (model != null) {
            this.model = model.isEmpty() ? DEFAULT_MODEL : model;
        } else {
            this.model = DEFAULT_MODEL;
        }
    }

    public int getConstructionYear() {
        constructionYear = constructionYear > 0 ? constructionYear : DEFAULT_CONSTRUCTION_YEAR;
        return constructionYear;
    }

    public void setConstructionYear(int constructionYear) {
        this.constructionYear = constructionYear > 0 ? constructionYear : DEFAULT_CONSTRUCTION_YEAR;
    }

    public int getPower() {
        power = power > 0 ? power : DEFAULT_POWER;
        return power;
    }

    public void setPower(int power) {
        this.power = power > 0 ? power : DEFAULT_POWER;
    }

    public String getTransmission() {
        if (transmission != null) {
            this.transmission = transmission.isEmpty() ? DEFAULT_TRANSMISSION : transmission;
        } else {
            this.transmission = DEFAULT_TRANSMISSION;
        }
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission != null) {
            this.transmission = transmission.isEmpty() ? DEFAULT_TRANSMISSION : transmission;
        } else {
            this.transmission = DEFAULT_TRANSMISSION;
        }
    }

    public int getNumberOfSeats() {
        numberOfSeats = numberOfSeats > 0 ? numberOfSeats : DEFAULT_NUMBER_OF_SEATS;
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats > 0 ? numberOfSeats : DEFAULT_NUMBER_OF_SEATS;
    }

    public void printInfo(Car[] cars) {
        System.out.println();
        System.out.println("Бренд - " + getBrand());
        System.out.println("Модель - " + getModel());
        System.out.println("Год производства - " + getConstructionYear());
        System.out.println("Мощность двигателя - " + getPower() + " лошадиных сил");
        System.out.println("Тип КПП - " + getTransmission());
        System.out.println("Количество мест - " + getNumberOfSeats());
    }
}
