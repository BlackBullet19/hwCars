public abstract class InternalCombustionEngine extends Car {

    private static final int DEFAULT_FUEL_CAPACITY = 5;
    private static final String DEFAULT_ENGINE_TYPE = "Керосин";
    private static final String DEFAULT_CHARGE_SYSTEM = "Атмосферный";
    private static final String DEFAULT_EMISSION_STANDARD = "Euro 3";

    private int fuelCapacity;
    private String engineType;
    private String chargeSystem;
    private String emissionStandard;

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity > 0 ? fuelCapacity : DEFAULT_FUEL_CAPACITY;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        if (engineType != null) {
            this.engineType = engineType.isEmpty() ? DEFAULT_ENGINE_TYPE : engineType;
        } else {
            this.engineType = DEFAULT_ENGINE_TYPE;
        }
    }

    public String getChargeSystem() {
        return chargeSystem;
    }

    public void setChargeSystem(String chargeSystem) {
        if (chargeSystem != null) {
            this.chargeSystem = chargeSystem.isEmpty() ? DEFAULT_CHARGE_SYSTEM : chargeSystem;
        } else {
            this.chargeSystem = DEFAULT_CHARGE_SYSTEM;
        }
    }

    public String getEmissionStandard() {
        return emissionStandard;
    }

    public void setEmissionStandard(String emissionStandard) {
        if (emissionStandard != null) {
            this.emissionStandard = emissionStandard.isEmpty() ? DEFAULT_EMISSION_STANDARD : emissionStandard;
        } else {
            this.emissionStandard = DEFAULT_EMISSION_STANDARD;
        }
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Тип наддува - " + getChargeSystem());
        System.out.println("Тип двигателя - " + getEngineType());
        System.out.println("Экологический класс - " + getEmissionStandard());
        System.out.println("Размер бака в литрах - " + getFuelCapacity());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Размер бака в литрах=" + fuelCapacity +
                ", Тип двигателя='" + engineType + '\'' +
                ", Тип наддува='" + chargeSystem + '\'' +
                ", Экологический класс='" + emissionStandard + '\'';
    }

    @Override
    public void printMessage() {
        super.printMessage();
        System.out.print(" с обычним ДВС");
    }
}
