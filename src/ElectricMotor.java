public abstract class ElectricMotor extends Car {

    private static final int DEFAULT_BATTERY_CAPACITY = 300;
    private static final int DEFAULT_FULL_CHARGE_TIME = 10;

    private int batteryCapacity;
    private int fullChargeTime;

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity > 0 ? batteryCapacity : DEFAULT_BATTERY_CAPACITY;
    }

    public int getFullChargeTime() {
        return fullChargeTime;
    }

    public void setFullChargeTime(int fullChargeTime) {
        this.fullChargeTime = fullChargeTime > 0 ? fullChargeTime : DEFAULT_FULL_CHARGE_TIME;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Емкость аккумулятора - " + getBatteryCapacity() + " кВт/ч");
        System.out.println("Время полной зарядки - " + getFullChargeTime() + " часов");
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Емкость аккумулятора=" + batteryCapacity +
                ", Время полной зарядки=" + fullChargeTime;
    }

    @Override
    public void printMessage() {
        super.printMessage();
        System.out.print(" но электрический");
    }
}
