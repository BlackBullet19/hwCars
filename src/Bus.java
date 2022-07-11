public class Bus extends InternalCombustionEngine {

    private static final int DEFAULT_NUMBER_OF_FLOORS = 1;
    private static final int DEFAULT_FLOOR_HEIGHT = 30;
    private static final int DEFAULT_NUMBER_OF_AXLES = 2;
    private static final String DEFAULT_BUS_TYPE = "Обычный автобус";

    private int numberOfFloors;
    private int floorHeight;
    private int numberOfAxles;
    private String busType;

    public int getNumberOfFloors() {
        numberOfFloors = numberOfFloors > 0 ? numberOfFloors : DEFAULT_NUMBER_OF_FLOORS;
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors > 0 ? numberOfFloors : DEFAULT_NUMBER_OF_FLOORS;
    }

    public int getFloorHeight() {
        floorHeight = floorHeight > 0 ? floorHeight : DEFAULT_FLOOR_HEIGHT;
        return floorHeight;
    }

    public void setFloorHeight(int floorHeight) {
        this.floorHeight = floorHeight > 0 ? floorHeight : DEFAULT_FLOOR_HEIGHT;
    }

    public int getNumberOfAxles() {
        numberOfAxles = numberOfAxles > 0 ? numberOfAxles : DEFAULT_NUMBER_OF_AXLES;
        return numberOfAxles;
    }

    public void setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles > 0 ? numberOfAxles : DEFAULT_NUMBER_OF_AXLES;
    }

    public String getBusType() {
        if (busType != null) {
            this.busType = busType.isEmpty() ? DEFAULT_BUS_TYPE : busType;
        } else {
            this.busType = DEFAULT_BUS_TYPE;
        }
        return busType;
    }

    public void setBusType(String busType) {
        if (busType != null) {
            this.busType = busType.isEmpty() ? DEFAULT_BUS_TYPE : busType;
        } else {
            this.busType = DEFAULT_BUS_TYPE;
        }
    }

    @Override
    public void printInfo(Car[] cars) {
        super.printInfo(cars);
        System.out.println("Количество осей - " + getNumberOfAxles());
        System.out.println("Тип автобуса - " + getBusType());
        System.out.println("Высота пола - " + getFloorHeight() + " сантиметра");
        System.out.println("Количество этажей - " + getNumberOfFloors());
    }
}
