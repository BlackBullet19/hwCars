public class ElectricMotor extends Car {

    private static final int DEFAULT_BATTERY_CAPACITY = 300;
    private static final int DEFAULT_FULL_CHARGE_TIME = 10;

    private int batteryCapacity;
    private int fullChargeTime;

    public int getBatteryCapacity() {
        batteryCapacity = batteryCapacity > 0 ? batteryCapacity : DEFAULT_BATTERY_CAPACITY;
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity > 0 ? batteryCapacity : DEFAULT_BATTERY_CAPACITY;
    }

    public int getFullChargeTime() {
        fullChargeTime = fullChargeTime > 0 ? fullChargeTime : DEFAULT_FULL_CHARGE_TIME;
        return fullChargeTime;
    }

    public void setFullChargeTime(int fullChargeTime) {
        this.fullChargeTime = fullChargeTime > 0 ? fullChargeTime : DEFAULT_FULL_CHARGE_TIME;
    }

    @Override
    public void printInfo(Car[] cars) {
        super.printInfo(cars);
        System.out.println("Емкость аккумулятора - " + getBatteryCapacity() + " кВт/ч");
        System.out.println("Время полной зарядки - " + getFullChargeTime() + " часов");
    }
}
