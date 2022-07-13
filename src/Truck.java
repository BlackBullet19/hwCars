public class Truck extends InternalCombustionEngine {

    private static final int DEFAULT_LOAD_CAPACITY = 2;
    private static final String DEFAULT_DRIVE_UNIT = "6x6";

    private int loadCapacity;
    private String driveUnit;

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity > 0 ? loadCapacity : DEFAULT_LOAD_CAPACITY;
    }

    public String getDriveUnit() {
        return driveUnit;
    }

    public void setDriveUnit(String driveUnit) {
        if (driveUnit != null) {
            this.driveUnit = driveUnit.isEmpty() ? DEFAULT_DRIVE_UNIT : driveUnit;
        } else {
            this.driveUnit = DEFAULT_DRIVE_UNIT;
        }
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Грузоподъемность - " + getLoadCapacity() + " тонн");
        System.out.println("Привод - " + getDriveUnit());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Грузоподъемность=" + loadCapacity + " тонн" +
                ", Привод='" + driveUnit + '\'';
    }

    @Override
    public void printMessage() {
        System.out.print("Этот грузовик это ");
        super.printMessage();
    }
}
